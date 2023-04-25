package com.example.shoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.repo.CustomerRepo;

@Service
public class GetDetailsService {

	@Autowired 
	CustomerRepo custRepo;
	
	public CustomerDetails getDetails(int id) {
		return custRepo.findById(id).get();
	}
}
