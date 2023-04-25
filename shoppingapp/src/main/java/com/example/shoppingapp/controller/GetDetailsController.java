package com.example.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.service.GetDetailsService;

@RestController
public class GetDetailsController {

	@Autowired
	GetDetailsService getDetail;
	
	@GetMapping("/get-details/{id}")
	public CustomerDetails getDetails(@PathVariable("id") int id) {
		return getDetail.getDetails(id);
	}
}
