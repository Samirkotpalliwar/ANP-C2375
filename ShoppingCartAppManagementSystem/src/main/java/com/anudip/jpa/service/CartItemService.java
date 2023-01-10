package com.anudip.jpa.service;

import com.anudip.jpa.entity.CartItem;


public interface CartItemService {
	
	CartItem saveCartItem(CartItem cartIteam, Integer cartId, Integer productId) ;

	String deleteProductFromCartItem(Integer productId) ;
	
	String deleteAllProductFromCartItem(Integer cartId) ;

	String updateProductQuantity(CartItem cartItem, Integer cartId, Integer productId) ;

	
	

}