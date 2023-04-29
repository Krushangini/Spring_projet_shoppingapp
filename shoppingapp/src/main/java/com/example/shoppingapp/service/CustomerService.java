package com.example.shoppingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.shoppingapp.model.CustomerDetails;
import com.example.shoppingapp.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	public CustomerDetails getDetails(int id) {
		return repo.findById(id).get();
	}
	
	public List<CustomerDetails> gets() {
		return repo.findAll();
	}
	
	public String login(String user,String pass) {
		List<CustomerDetails> li = repo.findAll();
		String res = null;
		for(CustomerDetails l : li) {
			if(l.getUser().equals(user)&&l.getPassword().equals(pass)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
	
	public CustomerDetails setUsernamePassword(CustomerDetails c){
		return repo.save(c);
	}
	
	public void deleteAcc(int id) {
		repo.deleteById(id);
	}
	
	public CustomerDetails changeUserPass(CustomerDetails c,int id){
		Optional<CustomerDetails> cust = repo.findById(id);
		CustomerDetails obj = null;
		if(cust.isPresent()) {
			obj = cust.get();
			obj.setCustomerId(c.getCustomerId());
			obj.setPassword(c.getPassword());
			obj.setUser(c.getUser());
			repo.saveAndFlush(c);
		}
		return obj;
	}
	
	public List<CustomerDetails> sortCustomer(String field){
		return repo.findAll(Sort.by(field));
	}
	
	public List<CustomerDetails> page(int of,int size){
		Pageable paging = PageRequest.of(of,size); 
		Page<CustomerDetails> pg = repo.findAll(paging);
		return pg.getContent();
	}
	
}
