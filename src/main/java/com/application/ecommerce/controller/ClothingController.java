package com.application.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.ecommerce.model.Item;
import com.application.ecommerce.service.ClothingService;

@RestController
public class ClothingController {
	@Autowired
	private ClothingService clothingService;
	@GetMapping("/home/clothing")
	  public List<Item> getAllClothingProduct(){
		  List<Item> clothingDbList= clothingService.getAllClothingProduct();
		  return clothingDbList;
	  }
	@GetMapping("/home/clothing/{productName}")
	public List<Item> getAllClothingIProductItem(@PathVariable("productName") String productName){
		List<Item> itemList=clothingService.getAllClothingIProductItem(productName);
		return itemList;
	}
}
