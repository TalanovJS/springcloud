package ru.vdcom.ordermodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vdcom.ordermodule.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
