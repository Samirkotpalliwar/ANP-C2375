package com.anudip.OneToOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Car {
	
	@Id
	private int modelNo;
	
	@Column(length=30,nullable=false)
	private String carName;
	
	@Column(length=30,nullable=false)
	private String carColour;
	
	@Column(length=30,nullable=false)
	private String carfeatures;
	
	@Column(length=30,nullable=false)
	private String carCompany;
	
	

}
