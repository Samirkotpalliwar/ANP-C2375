package com.anudip.onetoone.entity;

import javax.persistence.CascadeType;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@Column(length=30,nullable=false)
	private String Name;
	
	@Column(length=30,nullable=false)
	private String Email;
	
	@Column(length=30,nullable=false)
	private int Phone;
	
	@Column(length=30,nullable=false)
	private String address;
	
	@OneToOne(targetEntity=Shop.class,cascade=CascadeType.ALL)
    private Shop sh;  
}
