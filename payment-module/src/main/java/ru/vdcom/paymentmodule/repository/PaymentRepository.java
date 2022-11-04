package ru.vdcom.paymentmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vdcom.paymentmodule.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    Payment findByOrderId(Integer orderId);
}
