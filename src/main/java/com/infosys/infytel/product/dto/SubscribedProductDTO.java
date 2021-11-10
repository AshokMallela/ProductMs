package com.infosys.infytel.product.dto;

import com.infosys.infytel.product.entity.SubscribedProduct;

public class SubscribedProductDTO {
	
	private String buyerId;
	private String prodId;
	private Integer quantity;
	
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
	public SubscribedProductDTO() {
		super();
	}

	// Converts Entity into DTO
	public static SubscribedProductDTO valueOf(SubscribedProduct product) {
		SubscribedProductDTO subDTO= new SubscribedProductDTO();
		subDTO.setBuyerId(product.getBuyerId());
		subDTO.setProdId(product.getProdId());
		subDTO.setQuantity(product.getQuantity());
		return subDTO;
	}
	@Override
	public String toString() {
		return "subDTO [buyerId=" + buyerId + ", prodId=" + prodId + ", quantity=" + quantity
				+ "]";
	}

}
