package ru.vdcom.paymentmodule.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.vdcom.paymentmodule.entity.Payment;
import ru.vdcom.paymentmodule.repository.PaymentRepository;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
    private final ObjectMapper mapper;

    public Payment saveOrder(Payment payment) throws JsonProcessingException {
        payment.setPaymentStatus(getRandom());
        payment.setTransactionId(UUID.randomUUID().toString());

        log.info("Payment-Service Request : {}", mapper.writeValueAsString(payment));
        return paymentRepository.save(payment);
    }

    public String getRandom() {
        return new Random().nextBoolean() ? "success" : "decline";
    }

    public Payment findPaymentByOrderId(Integer orderId) throws JsonProcessingException {
        Payment payment = paymentRepository.findByOrderId(orderId);

        log.info("Payment-Service findPaymentHistoryByOrderId : {}",new ObjectMapper().writeValueAsString(payment));
        return paymentRepository.findByOrderId(orderId);
    }
}
