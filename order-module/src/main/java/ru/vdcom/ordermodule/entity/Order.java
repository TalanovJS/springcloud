package ru.vdcom.ordermodule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_TABLE")
public class Order {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer qty;
    private Double price;
}
