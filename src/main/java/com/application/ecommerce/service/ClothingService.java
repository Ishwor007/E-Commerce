package com.application.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.repository.ItemRepository;
@Service
public class ClothingService {
   @Autowired
	private ItemRepository itemrepo;
	 
	public List<Item> getAllClothingProduct() {
		List<Item> electronicsItemList=new ArrayList<>();
		List<Item> allDbList=itemrepo.findAll();
		for(Item item:allDbList) {
			if(item.getProduct().getProductcategory().getProductCategoryName().equalsIgnoreCase("Clothing&wears")) {
				electronicsItemList.add(item);
			}
		
		}
		return electronicsItemList;
	}

	public List<Item> getAllClothingIProductItem(String productName) {
		List<Item> clothingItemList=new ArrayList<>();
		List<Item> allDbItemList=itemrepo.findAll();
		for(Item item:allDbItemList) {
			if(item.getProduct().getProductName().equalsIgnoreCase(productName)){
				clothingItemList.add(item);
			}
					
		}
		return clothingItemList;
	}
}
