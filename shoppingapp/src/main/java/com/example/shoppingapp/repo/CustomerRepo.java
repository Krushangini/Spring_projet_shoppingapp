package com.example.shoppingapp.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.shoppingapp.model.CustomerDetails;


@Repository
public interface CustomerRepo extends JpaRepository<CustomerDetails, Integer>{

}

