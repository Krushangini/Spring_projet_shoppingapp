package com.example.shoppingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingapp.service.DeleteAccountService;

@RestController
public class DeleteAccountController {

	@Autowired
	DeleteAccountService delete;
	
	@DeleteMapping("delete-account/{id}")
	public void deleteAcc(@PathVariable("id") int id) {
		delete.deleteAcc(id);
	}
	
}
