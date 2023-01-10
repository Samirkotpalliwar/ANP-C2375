package com.anudip.jpa.service;

import com.anudip.jpa.entity.Product;

public interface ProductService {
	
    Product fingByProductId(Integer productId);
	
	Product findByProductName(String productName);
	
	Product findByProductCategory(String category);

}
