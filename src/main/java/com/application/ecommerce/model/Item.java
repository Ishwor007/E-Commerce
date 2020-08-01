package com.application.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Item {
     @Id
     @GeneratedValue
	  private int itemId;
	  private String itemName;
	  private double itemPrice;
	  private String itemImg;
	  private String itemDescription;
	  @ManyToOne(cascade = CascadeType.ALL,targetEntity = Product.class)
	  @JoinColumn(name = "productId",referencedColumnName = "productId")
	  private Product product;
	  
	  @ManyToMany(mappedBy = "listItem")
	  private List<Orders> OrdersList;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemimg() {
		return itemImg;
	}
	public void setItemimg(String itemimg) {
		this.itemImg = itemimg;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

}
