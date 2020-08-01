package com.application.ecommerce.model;

import java.util.List;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Orders {
		@Id
	@GeneratedValue
	private int orderId;
		
    private Date Orderdate;
    @ManyToMany
    @JoinTable(name = "order_item",
               joinColumns = @JoinColumn(name="orderId"),
               inverseJoinColumns = @JoinColumn(name="itemID"))
    private List<Item> listItem;
    @ManyToOne(cascade = CascadeType.ALL,targetEntity = User.class)
    @JoinColumn(name = "userId",referencedColumnName = "UserId")
    private User user;
    
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderdate() {
		return Orderdate;
	}

	public void setOrderdate(Date orderdate) {
		Orderdate = orderdate;
	}

	
	public List<Item> getListItem() {
		return listItem;
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
    
}
