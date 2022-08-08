package org.anudip.model;

public class Costumer {
	private int costumerId;
	private String costumerName;

	
	public Costumer() {
		this.costumerId=2;
		this.costumerName="samir";
		System.out.println("constructor without parameter");
	}
	public Costumer(int id,String name) {
		this.costumerId=id;
		this.costumerName=name;
		System.out.println("constructor with parameter");
	}
	public void setCostumerId(int id) {
		this.costumerId=id;
		
	}
	public int getCostumerId() {
		return costumerId;
	}
	public void setCostumerName(String name) {
		this.costumerName=name;
	}
	public String getCostumerName() {
		return costumerName;
		
	}
}

