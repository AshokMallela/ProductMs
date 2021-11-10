package com.infosys.infytel.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name = "prod_id", nullable = false)
	private String prodId;
	@Column(name = "product_name", nullable = false, length = 50)
	private String productName;
	@Column(name = "price", nullable = false)
	private Integer price;
	@Column(name = "stock", nullable = false)
	private Integer stock;
	@Column(name = "description", nullable = false, length = 50)
	private String description;
	@Column(name = "image", nullable = false)
	private String image;
	@Column(name = "seller_id", nullable = false)
	private String sellerid;
	@Column(name = "category", nullable = false, length = 50)
	private String category;
	@Column(name = "subcategory", nullable = false, length = 50)
	private String subcategory;
	@Column(name = "product_rating", nullable = false)
	private Integer productRating;
	
	public Product() {
		super();
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSellerId() {
		return sellerid;
	}

	public void setSellerId(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}

	public Integer getProductRating() {
		return productRating;
	}

	public void setProductRating(Integer productRating) {
		this.productRating = productRating;
	}

	
}
