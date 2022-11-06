package ru.vdcom.paymentmodule.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.vdcom.paymentmodule.entity.Payment;
import ru.vdcom.paymentmodule.service.PaymentService;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment savePayment(@RequestBody Payment payment) throws JsonProcessingException {
        return paymentService.saveOrder(payment);
    }

    @GetMapping("/{orderId}")
    public Payment findPaymentByOrderId(@PathVariable("orderId") Integer orderId) throws JsonProcessingException {
        return paymentService.findPaymentByOrderId(orderId);
    }
}
