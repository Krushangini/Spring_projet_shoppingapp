package com.example.shoppingapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.shoppingapp.model.AdminLogin;

@Repository
public interface AdminRepository extends JpaRepository<AdminLogin, String>{

	@Query("select ad from AdminLogin ad where ad.adminName =:name and ad.password = :pass ")
	AdminLogin findByAdminLogin(@Param(value="name") String name,@Param(value="pass") String pass);
	
}
