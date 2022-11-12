package com.anudip.onetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Shop_details")
public class Shop {
	
	@Id
	private int id;
	
	
	@Column(length=30,nullable=false,unique=true)
	private String Name;
	
	@Column(length=20,nullable=false,unique=true)
	private String Address;
	
	@Column(length=30,nullable=false)
	private int phoneNo;
	
	@Column(length=20,nullable=false)
	private String Type;
	
	

}
