package com.example.shoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.repo.CustomerRepo;

@Service
public class DeleteAccountService {

	@Autowired
	CustomerRepo customerRepo;
	
	public void deleteAcc(int id) {
		customerRepo.deleteById(id);
	}
}
