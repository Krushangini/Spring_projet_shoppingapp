package com.example.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@PostMapping("/register")
	public CustomerDetails getUsernamePassword(@RequestBody CustomerDetails c){
		return registerService.getUsernamePassword(c);
	}
}
