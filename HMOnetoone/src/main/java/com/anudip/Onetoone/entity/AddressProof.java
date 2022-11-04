package com.anudip.Onetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AddressProof {
	
	@Id
	private long idproof;
	
	@Column(length=30,nullable=false)
	private String type;
	
	@Column(length=50,nullable=false)
	private String address;
	
	@Column(length=30,nullable=false)
	private String city;
	
	@Column(length=30,nullable=false)
	private String state;
	
	

}
