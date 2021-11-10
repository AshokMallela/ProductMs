package com.infosys.infytel.product.dto;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.infosys.infytel.product.entity.Product;


public class ProductDTO {
	
	@Id
	private String prodId;
	@NotNull(message = "{Product.name.absent}")
	@Pattern(regexp ="(?=^[A-Za-z])(?=.*[A-Za-z]$)(?=[ A-Za-z]).{2,100}", message = "{Product.name.invalid}")
	private String productName;
	@NotNull(message = "{Product.price.absent}")
	@Min(value = 200, message = "Price should be minimum of 200")
	private Integer price;
	@NotNull(message = "{Product.stock.absent}")
	@Min(value = 10, message = "stock should be minimum of 10")
	private Integer stock;
	@NotNull(message = "{Product.description.absent}")
	@Pattern(regexp ="^.{1,500}$", message = "{Product.description.invalid}")
	private String description;
	@NotNull(message = "{Product.image.absent}")
	@Pattern(regexp ="^[A-Za-z].+[.png|.jpeg]$", message = "{Product.image.invalid}")
	private String image;
	@NotNull(message = "{Product.sellerid.absent}")
	private String sellerId;
	private String category;
	private String subcategory;
	private Integer productRating;

	
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
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
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

	public ProductDTO() {
		super();
	}
	
	public Product createEntity() {
		Product product = new Product();
		product.setProdId(this.getProdId());
		product.setProductName(this.getProductName());
		product.setPrice(this.getPrice());
		product.setStock(this.getStock());
		product.setDescription(this.getDescription());
		product.setImage(this.getImage());
		product.setSellerId(this.getSellerId());
		product.setCategory(this.getCategory());
		product.setSubcategory(this.getSubcategory());
		product.setProductRating(this.getProductRating());
		
		return product;
	}

	
	// Converts Entity into DTO
	public static ProductDTO valueOf(Product product) {
		ProductDTO productDTO= new ProductDTO();
		productDTO.setProdId(product.getProdId());
		productDTO.setProductName(product.getProductName());
		productDTO.setPrice(product.getPrice());
		productDTO.setStock(product.getStock());
		productDTO.setDescription(product.getDescription());
		productDTO.setImage(product.getImage());
		productDTO.setSellerId(product.getSellerId());
		productDTO.setCategory(product.getCategory());
		productDTO.setSubcategory(product.getSubcategory());
		productDTO.setProductRating(product.getProductRating());
		return productDTO;
	}
	@Override
	public String toString() {
		return "productDTO [prodId=" + prodId + ", productName=" + productName + ", price=" + price
				+ ", stock=" + stock + ", description=" + description + ", image=" + image + ", sellerId=" + sellerId + ", category=" + category + ", subcategory=" + subcategory + ", productRating=" + productRating + "]";
	}
}
