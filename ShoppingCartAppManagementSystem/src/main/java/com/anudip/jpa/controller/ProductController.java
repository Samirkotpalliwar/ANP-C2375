package com.anudip.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.jpa.entity.Product;
import com.anudip.jpa.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("/getp/{pid}")
	public ResponseEntity<Product>getp(@PathVariable("pid") int productId){
		return new ResponseEntity<Product>(ps.fingByProductId(productId),HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getn/{pName}")
	public ResponseEntity<Product>getn(@PathVariable("pName") String productName){
		return new ResponseEntity<Product>(ps.findByProductName(productName),HttpStatus.CREATED);
	}
	
	@GetMapping("/getCategory/{pCategory}")
	public ResponseEntity<Product>getCategory(@PathVariable("pCategory") String category){
		return new ResponseEntity<Product>(ps.findByProductCategory(category),HttpStatus.CREATED);
	
}
}