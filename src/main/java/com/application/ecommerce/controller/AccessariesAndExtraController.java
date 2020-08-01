package com.application.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.service.AccessariesAndExtraService;


@RestController
public class AccessariesAndExtraController {

	@Autowired
	private AccessariesAndExtraService extraService;
	@GetMapping("/home/accessaries")
	  public List<Item> getAllAccessoriesAndExtraProduct(){
		  List<Item> AccessoriesDbList=extraService.getAllAccessariesAndExtraProduct();
		  return AccessoriesDbList;
	  }
	@GetMapping("/home/accessaries/{productName}")
	public List<Item> getAllAccessoriesAndExtraProductItem(@PathVariable("productName") String productName){
		List<Item> itemList=extraService.getAllAccessariesAndExtraProductItem(productName);
		return itemList;
	}
}
