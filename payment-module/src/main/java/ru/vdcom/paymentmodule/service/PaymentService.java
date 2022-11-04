package ru.vdcom.paymentmodule.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.vdcom.paymentmodule.entity.Payment;
import ru.vdcom.paymentmodule.repository.PaymentRepository;

import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public Payment saveOrder(Payment payment) {
        payment.setPaymentStatus(getRandom());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    public String getRandom() {
        return new Random().nextBoolean() ? "success" : "decline";
    }

    public Payment findPaymentByOrderId(Integer orderId) {
        return paymentRepository.findByOrderId(orderId);
    }
}
