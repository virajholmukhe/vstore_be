package com.supermart.vstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vs_product_cart")
public class ProductCartEntity {

	@Id
	@Column(name = "product_cart_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productCartId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "quantity")
	private Integer quantity;

	public Integer getProductCartId() {
		return productCartId;
	}

	public void setProductCartId(Integer productCartId) {
		this.productCartId = productCartId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
