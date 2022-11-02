package ru.vdcom.paymentmodule.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.paymentmodule.entity.Payment;
import ru.vdcom.paymentmodule.service.PaymentService;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/doPayment")
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentService.saveOrder(payment);
    }
}
