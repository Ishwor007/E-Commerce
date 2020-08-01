package com.application.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.repository.ItemRepository;
@Service
public class ElectronicService {
	@Autowired
	private ItemRepository itemrepo;
	
	public List<Item> getAllElectronicsProduct() {
		List<Item> electronicsList= new ArrayList<>();
		List<Item> allDbList=itemrepo.findAll();
		for(Item item:allDbList) {
	if(item.getProduct().getProductcategory().getProductCategoryName().equalsIgnoreCase("electronics"))	{
		electronicsList.add(item);
			
		}

		}
	return electronicsList;
	}
	
	public List<Item> getAllElectronicsProductItem(String itemName) {
		List<Item> electronicsItemList=new ArrayList<>();
		List<Item> allDbList=itemrepo.findAll();
		for(Item item:allDbList) {
			if(item.getProduct().getProductName().equalsIgnoreCase(itemName)){
				electronicsItemList.add(item);
			}
	
	}
		return electronicsItemList;
	}
	
}
