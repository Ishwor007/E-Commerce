package com.application.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ProductCategory {
	@Id
	@GeneratedValue
	private int productCategoryId;
    private String productCategoryName;
    private String productCategoryColor;
    
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getProductCategoryColor() {
		return productCategoryColor;
	}
	public void setProductCategoryColor(String productCategoryColor) {
		this.productCategoryColor = productCategoryColor;
	}
    
}
