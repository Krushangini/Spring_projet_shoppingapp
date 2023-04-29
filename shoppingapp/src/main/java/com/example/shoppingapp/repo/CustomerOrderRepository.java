package com.example.shoppingapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.shoppingapp.model.CustomerOrders;


@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrders, Integer>{

	@Query("select SUM(o.cost), p.customerId from CustomerOrders o join CustomerDetails p on p.customerId=o.custid group by o.custid")
	List<Object[]> findTotalAmount();
	
	
}
