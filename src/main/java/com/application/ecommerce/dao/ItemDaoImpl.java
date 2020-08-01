package com.application.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.repository.ItemRepository;
@Component
public class ItemDaoImpl implements ItemDao {
	@Autowired
     private ItemRepository itemrepo;
	@Override
	public List<Item> getAllItem() {
		return itemrepo.findAll();
	}
	@Override
	public void add(Item item) {
		
	  itemrepo.save(item);
		
	}

	
}
