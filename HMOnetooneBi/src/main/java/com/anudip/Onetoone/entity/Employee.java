package com.anudip.Onetoone.entity;

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
public class Employee {


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		
		@Column(length=30,nullable=false)
		private String Ename;
		
		@Column(length=30,nullable=false)
		private String email;
		
		@Column(length=11,nullable=false)
		private int phone;
		
		@OneToOne(targetEntity=AddressProof.class,cascade=CascadeType.ALL)
        private AddressProof ap;  //has a relationship(Aggregation)

		
		}

	


