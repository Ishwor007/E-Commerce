package com.application.ecommerce.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.application.ecommerce.dao.ItemDao;
import com.application.ecommerce.model.Item;
import com.application.ecommerce.model.Product;
import com.application.ecommerce.model.ProductCategory;

@RestController
public class ItemController {
@Autowired
	 private ItemDao itemdao;
	   @PostMapping("/file")
	   public ResponseEntity<String> save(@RequestParam("file") MultipartFile file,Item item,Product product,ProductCategory pc) {
		 String  name=file.getOriginalFilename();
		 System.out.println(name);
		  
		   try {
			    byte[] b=file.getBytes(); 
			   Path path=Paths.get("/home/seetal/Documents/workspace-spring-tool-suite-4-4.6.0.RELEASE/E-Commerce/src/main/webapp/photos/"+name);
			     Files.write(path, b);
		   }catch(Exception e) {
			   
		   }
		   item.setItemimg(name);
		  item.setProduct(product);
		  item.getProduct().setProductcategory(pc);
		   itemdao.add(item);
		return new ResponseEntity<>("success",HttpStatus.OK);
	   }
	   
	   @GetMapping("/home")
	     public List<Item> getAll(){
		   return itemdao.getAllItem();
	   }
}
