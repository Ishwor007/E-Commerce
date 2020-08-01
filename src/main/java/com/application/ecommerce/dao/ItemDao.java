package com.application.ecommerce.dao;

import java.util.List;

import com.application.ecommerce.model.Item;

public interface ItemDao {

	public List<Item> getAllItem();

	public void add(Item item);

	
}
