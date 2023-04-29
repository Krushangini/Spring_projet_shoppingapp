package com.example.shoppingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.shoppingapp.model.ProductDetails;
import com.example.shoppingapp.repo.ProductRepo;

@Service
public class ProductdetailService {

	@Autowired
	ProductRepo repo;
	
	public List<String[]> groupBrand(){
		List<String[]> results = repo.groupByBrand();
		return results;
	}
	
	public List<String> showCategory(){
		return repo.findAllCategory();
	}
	
	public List<ProductDetails> showByType(String type,int off,int size,String field,String sortOrder){
		Sort sort = Sort.by(field).ascending();
		if(sortOrder.equalsIgnoreCase("dsc")) {
			sort = sort.descending();
		}
		Pageable pa = PageRequest.of(off, size,sort);
		List<ProductDetails> list = repo.findByProductType(type,pa);
		return list;
	}
	
	public List<ProductDetails> showByCategory(String category,int off,int size,String field,String sortOrder){
		Sort sort = Sort.by(field).ascending();
		if(sortOrder.equalsIgnoreCase("dsc")) {
			sort = sort.descending();
		}
		Pageable pa = PageRequest.of(off, size,sort);
		List<ProductDetails> list = repo.findByProductCategory(category,pa);
		return list;
	}
	
	public List<ProductDetails> showByBrand(String brand,int off,int size,String field,String sortOrder){
		Sort sort = Sort.by(field).ascending();
		if(sortOrder.equalsIgnoreCase("dsc")) {
			sort = sort.descending();
		}
		Pageable pa = PageRequest.of(off, size,sort);
		List<ProductDetails> list = repo.findByProductBrand(brand,pa);
		return list;
	}
	
}
