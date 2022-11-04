package ru.vdcom.ordermodule.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vdcom.ordermodule.common.TransactionRequest;
import ru.vdcom.ordermodule.common.TransactionResponse;
import ru.vdcom.ordermodule.service.OrderService;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/doOrder")
    public TransactionResponse saveOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
        return orderService.saveOrder(request);
    }
}
