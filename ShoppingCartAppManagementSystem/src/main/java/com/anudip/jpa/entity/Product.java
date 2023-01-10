package com.anudip.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int productId;
	
	@Column(length = 25,nullable = false)
	private String productName;
	
	@Column(length = 10,nullable = false)
	private float price;
	
	@Column(length = 25,nullable = false)
	private String category;

}
