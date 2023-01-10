package com.anudip.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anudip.jpa.entity.CartItem;
import com.anudip.jpa.service.CartItemService;

@RestController
@RequestMapping("/cart")
public class CartItemController {
	
	@Autowired
	CartItemService cartItemService;
	/*
	 * Endpoint to save cartItem in cart
	 */
	@PostMapping("/{cartId}/product/{productId}/add")
	public ResponseEntity<?> saveCartItem(@RequestBody CartItem cartIteam,@PathVariable Integer cartId,@PathVariable("productId") Integer productId){
		
		CartItem cartItem;
		
			cartItem = cartItemService.saveCartItem(cartIteam,cartId,productId);
			return ResponseEntity.status(HttpStatus.CREATED).body(cartItem);

		
	}
	 /*
	  * Endpoint to Delete Product Form cart
	  */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProductFromCart(@PathVariable("id") Integer productId) {
		
		
			return ResponseEntity.status(HttpStatus.OK).body(cartItemService.deleteProductFromCartItem(productId));
		
	}
	/*
	 * Endpoint to Delete All product from cart
	 */
	@DeleteMapping("/delete/all/{cartId}")
	public ResponseEntity<String> deleteAllProductFromCart(@PathVariable Integer cartId) {
		
			return ResponseEntity.ok(cartItemService.deleteAllProductFromCartItem(cartId));
		
		
	}
	
	/*
	 * Endpoint to update product Quantity 
	 */
	@PutMapping("/update/{cartId}/product/{id}")
	public ResponseEntity<String> updateProductQuantity(@RequestBody CartItem cartItem, @PathVariable ("id") Integer ProductId,
			@PathVariable ("cartId")Integer cartId) {
		
			
			return ResponseEntity.ok(cartItemService.updateProductQuantity(cartItem,cartId,ProductId));
		
	}
	

}

