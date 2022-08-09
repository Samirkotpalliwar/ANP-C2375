package com.anudip.model;

import com.anudip.product;

public class mainview {
	public static void main(String[]args) {
		product product1=new product();
		product product2=new product("cake",300);
		
		mainview mainview=new mainview();
		System.out.println("product name="+product1.getProductName());
		System.out.println("product price="+product2.getProductPrice());
		
		System.out.println("price="+mainview.getDoubleProductPriceFromPrice(product1.getProductPrice()));
		mainview.getProductNameFromProductObject(product1);
		System.out.println("name="+mainview.getProductNameFromProductObject(product1));
		
	}
      int getDoubleProductPriceFromPrice(int price) {
    	  System.out.println(price);
    	  return 2*price;
      }
      String getProductNameFromProductObject(product obj) {
    	  
    	   
    	   return obj.getProductName();
    }
}
