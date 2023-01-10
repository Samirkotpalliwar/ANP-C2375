package com.anudip.jpa.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.Product;
import com.anudip.jpa.repository.ProductRepository;
import com.anudip.jpa.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository pr;
	
	@Override
	public Product fingByProductId(Integer productId) {
		// TODO Auto-generated method stub
		return pr.fingByProductId(productId);
	}

	@Override
	public Product findByProductName(String productName) {
		// TODO Auto-generated method stub
		return pr.findByProductName(productName);
	}

	@Override
	public Product findByProductCategory(String category) {
		// TODO Auto-generated method stub
		return pr.findByCategory(category);
	}

}
