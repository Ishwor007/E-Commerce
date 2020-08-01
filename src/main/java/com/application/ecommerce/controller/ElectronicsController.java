package com.application.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.application.ecommerce.model.Item;
import com.application.ecommerce.service.ElectronicService;

import ch.qos.logback.core.status.Status;



@RestController
public class ElectronicsController {
 @Autowired
	private ElectronicService electronicService;
 
        @GetMapping("/home/electronics")
	  public List<Item> getAllElectronicsProduct(){
		  List<Item> electronicdbList = electronicService.getAllElectronicsProduct();
	//	  System.out.println(electronicdbList);
		  return electronicdbList;
	  }
   @GetMapping("/home/electronics/{itemName}")
   public List<Item> getElectronicsProductItem(@PathVariable("itemName") String itemName){
	   List<Item> itemList= electronicService.getAllElectronicsProductItem(itemName);
	   return itemList;
   }
   
}
