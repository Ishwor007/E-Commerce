package com.application.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.repository.ItemRepository;
@Service
public class AccessariesAndExtraService {
	 @Autowired
		private ItemRepository itemrepo;
		
		public List<Item> getAllAccessariesAndExtraProduct() {
			List<Item> accessoriesProductList=new ArrayList<>();
			List<Item> allDbList=itemrepo.findAll();
			for(Item item:allDbList) {
				if(item.getProduct().getProductcategory().getProductCategoryName().equalsIgnoreCase("accessaries&extra")) {
					accessoriesProductList.add(item);
				}
			
			}
			return accessoriesProductList;
		}

		public List<Item> getAllAccessariesAndExtraProductItem(String productName) {
			List<Item> accessoriesItemList=new ArrayList<>();
			List<Item> allDbItemList=itemrepo.findAll();
			for(Item item:allDbItemList) {
				if(item.getProduct().getProductName().equalsIgnoreCase(productName)){
					accessoriesItemList.add(item);
				}
						
			}
			return accessoriesItemList;
		}
}
