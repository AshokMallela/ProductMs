package com.infosys.infytel.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscribedproduct")
public class SubscribedProduct {
	@Id
	@Column(name = "buyer_id", nullable = false)
	private String buyerId;
//	@Column(name = "prod_id", nullable = false)
	private String prodId;
//	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	
	public SubscribedProduct() {
		super();
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
}
