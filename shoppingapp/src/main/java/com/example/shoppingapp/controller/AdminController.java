package com.example.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingapp.model.AdminLogin;
import com.example.shoppingapp.model.ProductDetails;
import com.example.shoppingapp.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	AdminService service;
	
	@GetMapping("/admin-login")
	public String adminLogin(@RequestBody AdminLogin admin) {
		String adminName = admin.getAdminName();
		String adminPass = admin.getPassword();
		return service.adminLogin(adminName,adminPass);
	}
	
	@PostMapping("/add-product")
	public String saveProduct(@RequestBody ProductDetails product ) {
		ProductDetails p = service.savePrducts(product);
		if(p!=null) {
			return "product detail entered sucessfully";
		}
		return "product not inserted";
	}
	
}
