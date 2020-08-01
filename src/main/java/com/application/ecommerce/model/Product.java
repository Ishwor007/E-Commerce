package com.application.ecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	 private String productName;
	 private String productColor;
	 
	 @ManyToOne(cascade = CascadeType.ALL,targetEntity = ProductCategory.class)
	 @JoinColumn(name = "categoryId",referencedColumnName = "productCategoryId")
	 private ProductCategory productcategory;
	 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public ProductCategory getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(ProductCategory productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	 
	 
	 
}
