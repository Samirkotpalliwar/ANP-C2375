package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anudip.jpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	@Query(value = "Select * from product where product_id=?1",nativeQuery=true )
	Product fingByProductId(Integer productId);
	
	Product findByProductName(String productName);
	
	Product findByCategory(String category);
}
