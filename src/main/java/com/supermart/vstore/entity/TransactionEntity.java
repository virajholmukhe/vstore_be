package com.supermart.vstore.entity;

import java.time.LocalDateTime;

import com.supermart.vstore.enums.TransactionStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vs_transaction")
public class TransactionEntity {

	@Id
	@Column(name = "email_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transactionId;
	
	@Column(name = "email_id")
	private Integer orderId;
	
	@Column(name = "email_id")
	private Integer cardId;
	
	@Column(name = "email_id")
	private Double totalPrice;
	
	@Column(name = "email_id")
	private LocalDateTime transactionDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "email_id")
	private TransactionStatus transactionStatus;
	
	
}
