package com.lara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lara.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
