package com.supermart.vstore.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vs_customer_cart")
public class CustomerCartEntity {

	@Id
	@Column(name = "cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;

	@Column(name = "customer_email_id")
	private String customerEmailId;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cartId")
	private Set<ProductCartEntity> cartProducts;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public Set<ProductCartEntity> getCartProducts() {
		return cartProducts;
	}

	public void setCartProducts(Set<ProductCartEntity> cartProducts) {
		this.cartProducts = cartProducts;
	}
	
	
}
