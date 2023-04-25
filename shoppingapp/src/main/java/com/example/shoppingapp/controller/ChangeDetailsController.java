package com.example.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.service.ChangeDetailsService;

@RestController
public class ChangeDetailsController {

	@Autowired
	ChangeDetailsService changeDetailsService;
	
	@PutMapping("change-user-pass")
	public CustomerDetails changeUserPass(@RequestBody CustomerDetails cd) {
		return changeDetailsService.changeUserPass(cd);
	}
}
