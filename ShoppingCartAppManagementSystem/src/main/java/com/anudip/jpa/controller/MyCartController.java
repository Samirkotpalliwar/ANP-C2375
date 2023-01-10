package com.anudip.jpa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.jpa.entity.MyCart;
import com.anudip.jpa.service.MyCartService;

@RestController
@RequestMapping("/cart")
public class MyCartController {
	
	@Autowired(required = true)
	MyCartService cs;
	
	@PostMapping("/savec/{id}")
	public ResponseEntity<MyCart>savec(@Valid @RequestBody MyCart mycart ,@PathVariable("id") int userId){
		return new ResponseEntity<MyCart>(cs.saveCart(mycart, userId),HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/getc/{cid}")
	public ResponseEntity<MyCart>getu(@PathVariable("cid") int cartId){
		return new ResponseEntity<MyCart>(cs.findByCartId(cartId),HttpStatus.OK);
	}
	
}
