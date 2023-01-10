package com.anudip.jpa.service;

import com.anudip.jpa.entity.MyCart;

public interface MyCartService {
	
	
	MyCart saveCart(MyCart cart,Integer userId);
	
	MyCart findByCartId(Integer cartId);

}
