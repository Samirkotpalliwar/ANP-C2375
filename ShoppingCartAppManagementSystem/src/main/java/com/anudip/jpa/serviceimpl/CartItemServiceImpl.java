package com.anudip.jpa.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.CartItem;
import com.anudip.jpa.entity.MyCart;
import com.anudip.jpa.entity.Product;
import com.anudip.jpa.repository.CartItemRepository;
import com.anudip.jpa.repository.MyCartRepository;
import com.anudip.jpa.repository.ProductRepository;
import com.anudip.jpa.service.CartItemService;



@Service
public class CartItemServiceImpl implements CartItemService{
	
	
	@Autowired
	CartItemRepository cartItemRepository;
	
	@Autowired
	MyCartRepository myCartRepository;
	
	@Autowired
	ProductRepository productRepository;


	@Override
	public CartItem saveCartItem(CartItem cartItem, Integer cartId, Integer productId) {
		/*
		 * Cheking product is already added or not 
		 */
		 
		 CartItem existingCartItem=cartItemRepository.findByProductIdAndCartId(productId,cartId);
		
		if(existingCartItem!=null) {
			existingCartItem.setQuantity( existingCartItem.getQuantity()+1);
			return cartItemRepository.save(existingCartItem);
		}
		/*
		 * fetching the cart details
		 */
		MyCart cart = myCartRepository.findByCartId(cartId);
		
			 cartItem.setCart(cart);
		
		/*
		 * fetching product from product Database;
		 */
		 Product product=productRepository.fingByProductId(productId);
		 
	      cartItem.setProduct(product);
	    
		return cartItemRepository.save(cartItem);
	}


	@Override
	public String deleteProductFromCartItem(Integer productId)  {
		// TODO Auto-generated method stub
		
		 Optional<CartItem> cartItem= Optional.ofNullable((cartItemRepository.findByProductId(productId)));
		
		
		 cartItemRepository.delete(cartItem.get());
		
		return "Deleted Successfully";
	}

	@Override
	public String deleteAllProductFromCartItem(Integer cartId) {
		List<CartItem> cartItems=cartItemRepository.findByCardId(cartId);
		
		cartItemRepository.deleteAll(cartItems);
		return "Delected Successfully";
	}

	@Override
	public String updateProductQuantity(CartItem cartItem, Integer cartId, Integer productId) {
		// TODO Auto-generated method stub
		CartItem existingCartItem=cartItemRepository.findByProductIdAndCartId(productId, cartId);
		
		if(cartItem.getQuantity()<0) {
			return "Quantity should not be negative ";
		}
		if(cartItem.getQuantity()==0) {
			cartItemRepository.delete(existingCartItem);
			return"updated successufully";
		}
		existingCartItem.setQuantity(cartItem.getQuantity());
		cartItemRepository.save(existingCartItem);
		return "updated successfully";
	}

	
	}


	



	
	


	


