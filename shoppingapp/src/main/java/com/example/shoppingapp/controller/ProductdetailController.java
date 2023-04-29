package com.example.shoppingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.shoppingapp.model.ProductDetails;
import com.example.shoppingapp.service.ProductdetailService;

@RestController
public class ProductdetailController {

	@Autowired
	ProductdetailService service;
	
	@GetMapping("/categories")
	public List<String> showCategory(){
		return service.showCategory();
	}
	
	@GetMapping("/products-by-type")
	public List<ProductDetails> showByType(@RequestParam String type,@RequestParam int off,@RequestParam int size,@RequestParam String field,@RequestParam String sortOrder){
		return service.showByType(type,off,size,field,sortOrder);
	}
	
	@GetMapping("/products-by-category")
	public List<ProductDetails> showByCategory(@RequestParam String category,@RequestParam int off,@RequestParam int size,@RequestParam String field,@RequestParam String sortOrder){
		return service.showByCategory(category,off,size,field,sortOrder);
	}
	
	@GetMapping("/products-by-brand")
	public List<ProductDetails> showByBrand(@RequestParam String brand,@RequestParam int off,@RequestParam int size,@RequestParam String field,@RequestParam String sortOrder){
		return service.showByBrand(brand,off,size,field,sortOrder);
	}
	
	@GetMapping("/group-by-brand")
	public List<String[]> groupBrand(){
		return service.groupBrand();
	}
	
}
