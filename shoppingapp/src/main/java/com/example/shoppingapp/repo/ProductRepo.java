package com.example.shoppingapp.repo;

import java.util.List;	
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shoppingapp.model.ProductDetails;

@Repository
public interface ProductRepo extends JpaRepository<ProductDetails, Integer>{

	@Query(value="select p.productCategory from ProductDetails p group by p.productCategory")
	List<String> findAllCategory();
	
	@Query(value="select p.productBrand from ProductDetails p group by p.productBrand")
	List<String[]> groupByBrand();
	
	List<ProductDetails> findByProductBrand(String productBrand,Pageable page);
	List<ProductDetails> findByProductCategory(String productCategory,Pageable page);
	List<ProductDetails> findByProductType(String productType,Pageable page);


	
}
