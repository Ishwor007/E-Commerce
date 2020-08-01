package com.application.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
      @GetMapping("/home/cart")
	  public String getCartPage() {
		  return "cart";
	  }
}
