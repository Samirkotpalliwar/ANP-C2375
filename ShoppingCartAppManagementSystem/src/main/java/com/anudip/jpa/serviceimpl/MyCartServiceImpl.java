package com.anudip.jpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.MyCart;
import com.anudip.jpa.repository.MyCartRepository;
import com.anudip.jpa.service.MyCartService;

@Service
public class MyCartServiceImpl implements MyCartService{
	
	@Autowired
	  MyCartRepository crepo;

	@Override
	public MyCart saveCart(MyCart cart, Integer userId) {
		// TODO Auto-generated method stub
		return crepo.save(cart);
	}

	@Override
	public MyCart findByCartId(Integer cartId) {
		// TODO Auto-generated method stub
		return crepo.findByCartId(cartId);
	}

}
