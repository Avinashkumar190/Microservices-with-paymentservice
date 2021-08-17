package com.lara.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "PAYMENT_TB")
public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStaus;
	private String transactionId;
	private int orderId;
	private double amount;

}
