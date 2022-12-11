package com.anudip.jpa.entity;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="PassengerInfo")

public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Enter your surname")
	private String pName;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Enter your surname")
	private String pEmail;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Enter your surname")
	private long phone;
	
	

}
