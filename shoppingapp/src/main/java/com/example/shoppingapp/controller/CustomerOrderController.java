package com.example.shoppingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingapp.model.CustomerOrders;
import com.example.shoppingapp.service.CustomerOrderService;

@RestController
public class CustomerOrderController {
	
	@Autowired
	CustomerOrderService service;

	@GetMapping("/all-orders")
	public List<Object[]> totalAmount(){
		return service.totalAmount();
	}
	
	@PostMapping("/order")
	public CustomerOrders orderProducts(@RequestBody CustomerOrders order){
		return service.orderProducts(order);
	}
	
}
