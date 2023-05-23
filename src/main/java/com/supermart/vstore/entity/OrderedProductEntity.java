package com.supermart.vstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vs_ordered_product")
public class OrderedProductEntity {

	@Id
	@Column(name = "ordered_product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderedProductId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "qauntity")
	private Integer quantity;

	public Integer getOrderedProductId() {
		return orderedProductId;
	}

	public void setOrderedProductId(Integer orderedProductId) {
		this.orderedProductId = orderedProductId;
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
