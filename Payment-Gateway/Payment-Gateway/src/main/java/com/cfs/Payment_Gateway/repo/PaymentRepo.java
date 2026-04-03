package com.cfs.Payment_Gateway.repo;


import com.cfs.Payment_Gateway.entity.PaymentOrder;
import com.razorpay.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Long> {

    PaymentOrder findOrderId(String orderId);
}
