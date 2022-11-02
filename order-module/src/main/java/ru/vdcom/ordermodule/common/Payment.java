package ru.vdcom.ordermodule.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer id;
    private String paymentStatus;
    private String transactionId;
    private Integer orderId;
    private Double amount;
}
