package ru.vdcom.ordermodule.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.vdcom.ordermodule.entity.Order;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResponse {
    private Order order;
    private Double amount;
    private String transactionId;
    private String message;
}
