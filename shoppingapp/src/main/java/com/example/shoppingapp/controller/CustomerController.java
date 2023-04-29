package com.example.shoppingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService custService;
	
	@GetMapping("/get-details/{id}")
	public CustomerDetails getDetails(@PathVariable("id") int id) {
		return custService.getDetails(id);
	}
	
	@GetMapping("/get-details")
	public List<CustomerDetails> getDetail() {
		return custService.gets();
	}
	
	@PostMapping("/register")
	public CustomerDetails getUsernamePassword(@RequestBody CustomerDetails c){
		return custService.setUsernamePassword(c);
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String user,@RequestParam String pass) {
		return custService.login(user,pass);
	}
	
	@DeleteMapping("delete-account/{id}")
	public void deleteAcc(@PathVariable("id") int id) {
		custService.deleteAcc(id);
	}
	
	@PutMapping("change-user-pass")
	public CustomerDetails changeUserPass(@RequestBody CustomerDetails cd,@RequestParam int id) {
		return custService.changeUserPass(cd,id);
	}
	
	@GetMapping("/paging/{offset}/{size}")
	public List<CustomerDetails> page(@PathVariable("offset") int offset,@PathVariable("size") int size){
		return custService.page(offset,size);
	}
	
	@GetMapping("/sort-cust/{field}")
	public List<CustomerDetails> sortCustomer(@PathVariable("field") String field){
		return custService.sortCustomer(field);
	}
}
