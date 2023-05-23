package com.supermart.vstore.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.supermart.vstore.enums.OrderStatus;
import com.supermart.vstore.enums.PaymentThrough;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vs_order")
public class OrderEntity {

	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;

	@Column(name = "customer_email_id")
	private String customerEmailId;

	@Column(name = "date_of_order")
	private LocalDateTime dateOfOrder;

	@Column(name = "discount")
	private Double discount;

	@Column(name = "total_price")
	private Double totalPrice;

	@Enumerated(EnumType.STRING)
	@Column(name = "order_status")
	private OrderStatus orderStatus;

	@Enumerated(EnumType.STRING)
	@Column(name = "payment_through")
	private PaymentThrough paymentThrough;

	@Column(name = "date_of_delivery)")
	private LocalDateTime dateOfDelivery;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ordered_products")
	private List<OrderedProductEntity> orderedProducts;

	@Column(name = "delivery_address")
	private String deliveryAddress;
	
	
}
