package com.example.shoppingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.model.CustomerOrders;
import com.example.shoppingapp.repo.CustomerOrderRepository;

@Service
public class CustomerOrderService {

	@Autowired
	CustomerOrderRepository repo;
	
	public List<Object[]> totalAmount(){
		return repo.findTotalAmount();
	}
	
	public CustomerOrders orderProducts(CustomerOrders order){
		return repo.save(order);
	}
	
}
