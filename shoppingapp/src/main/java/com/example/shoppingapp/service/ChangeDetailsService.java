package com.example.shoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.repo.CustomerRepo;

@Service
public class ChangeDetailsService {
	@Autowired
	CustomerRepo customerRepo;

	public CustomerDetails changeUserPass(CustomerDetails c){
		return customerRepo.save(c);
	}
}
