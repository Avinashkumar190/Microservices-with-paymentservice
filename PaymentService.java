package com.lara.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.entity.Payment;
import com.lara.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStaus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	
	public String paymentProcessing() {
		//api should be 3rd party payment getway(paypal, paytm, phonepay)
		return new Random().nextBoolean() ? "success": "false";
	}

	public Payment findPaymentHistoryByOrderId(int orderId) {
		return repository.findByOrderId(orderId);
	}

}
