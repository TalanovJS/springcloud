package ru.vdcom.paymentmodule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_TABLE")
public class Payment {
    @Id
    @GeneratedValue
    private Integer id;
    private String paymentStatus;
    private String transactionId;
    private Integer orderId;
    private Double amount;
}
