package com.application.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.ecommerce.model.Item;
import com.application.ecommerce.model.Orders;
import com.application.ecommerce.repository.OrderRepository;
@Service
public class OrderService {
	
	@Autowired
   private OrderRepository orderRepo;
	public List<Orders> getAllOrder() {
		return orderRepo.findAll();
	}
	
	public List<Orders> getOrderItem(String item) {
		List<Item> list=new ArrayList<>();
		List<Orders> olist=new ArrayList<>();
		List<Orders> order=orderRepo.findAll();
		   
		
		
	  return olist;
		
		
	}

}
