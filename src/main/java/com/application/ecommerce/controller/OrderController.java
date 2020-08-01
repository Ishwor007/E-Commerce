package com.application.ecommerce.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.ecommerce.model.Orders;
import com.application.ecommerce.service.OrderService;

@RestController
public class OrderController {
	@Autowired
    private OrderService orderService;
	@GetMapping("/home/order")
	@ResponseBody
	  public List<Orders> getAllOrder(){
		  List<Orders> orderlist=orderService.getAllOrder();
		  return orderlist;
	  }
	@GetMapping("/home/order/{item}")
	@ResponseBody
	  public List<Orders> getOrderItem(@PathVariable("item") String item){
		  List<Orders> orderItemList=orderService.getOrderItem(item);
		  return orderItemList;
	  }
}
