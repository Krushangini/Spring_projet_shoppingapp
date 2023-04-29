package com.example.shoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.model.AdminLogin;
import com.example.shoppingapp.model.ProductDetails;
import com.example.shoppingapp.repo.AdminRepository;
import com.example.shoppingapp.repo.ProductRepo;

@Service
public class AdminService {

	@Autowired
	AdminRepository repo;
	
	@Autowired
	ProductRepo prepo;
	
	public String adminLogin(String name,String pass) {
		AdminLogin ad = repo.findByAdminLogin(name, pass);
		if(ad!=null) {
			return "login success";
		}
		return "login faile";
	}
	
	public ProductDetails savePrducts(ProductDetails product) {
		return prepo.save(product);
	}
}
