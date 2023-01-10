package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anudip.jpa.entity.MyCart;

@Repository
public interface MyCartRepository extends JpaRepository<MyCart,Integer>{
	
	MyCart findByCartId(Integer cartId);

}
