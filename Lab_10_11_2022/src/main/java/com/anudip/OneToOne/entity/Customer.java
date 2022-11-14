package com.anudip.OneToOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



import lombok.Data;

@Data
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CusId;
	
	@Column(length=30,nullable=false)
	private String CusName;
	
	@Column(length=30,nullable=false)
	private String Address;
	
	@Column(length=30,nullable=false)
	private int phone;
	
	@Column(length=30,nullable=false)
	private String Email;
	
	@OneToOne(targetEntity=Car.class,cascade=CascadeType.ALL)
    private Car ca;

}
