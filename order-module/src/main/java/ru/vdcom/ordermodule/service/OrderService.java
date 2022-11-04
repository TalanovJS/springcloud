package ru.vdcom.ordermodule.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import ru.vdcom.ordermodule.common.Payment;
import ru.vdcom.ordermodule.common.TransactionRequest;
import ru.vdcom.ordermodule.common.TransactionResponse;
import ru.vdcom.ordermodule.entity.Order;
import ru.vdcom.ordermodule.repository.OrderRepository;

import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
@RefreshScope
public class OrderService {

    private final OrderRepository orderRepository;

    @Lazy
    private final RestTemplate restTemplate;

    @Value("${microservice.payment-service.endpoints.endpoint.uri}")
    private String PAYMENT_URL;

    public TransactionResponse saveOrder(TransactionRequest request) throws JsonProcessingException {
        String response = "";
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setAmount(order.getPrice());
        Payment post = restTemplate.postForObject(PAYMENT_URL, payment, Payment.class);
        response = Objects.requireNonNull(post).getPaymentStatus().equals("success") ? "payment processing successful and order placed" : "there is a failure in payment api , order added to cart";
        orderRepository.save(order);
        return new TransactionResponse(order, post.getAmount(), post.getTransactionId(), response);
    }
}
