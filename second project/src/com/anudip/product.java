package com.anudip;

public class product {
	private String productName;
	private int productPrice;
	
	public product() {
		this.productName="mobile";
		this.productPrice=10000;
		System.out.println("Constructor without parameter");
		
	}
	public product(String name,int price) {
		this.productName=name;
		this.productPrice=price;
		System.out.println("Constructor with parameter");
	}
	public void setProductName(String name) {
		this.productName=name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductPrice(int price) {
		this.productPrice=price;
	}
	public int getProductPrice() {
		return productPrice;
	}
	@Override
	public String toString() {
		return "product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	

}
