package com.application.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	   public String getHomePage() {
		   return "home";
	   }
       @GetMapping("/admin/")
    	   public String getAdminPage() {
    		   return "admin";
    	   }
       }


