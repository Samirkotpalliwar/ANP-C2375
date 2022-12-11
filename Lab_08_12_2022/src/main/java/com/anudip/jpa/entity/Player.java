package com.anudip.jpa.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Player_Info")
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Enter Your name")
	private String name;
	
	@Column(length=30,nullable=false,unique=true)
	@Email(message="Enter proper email id")
	@NotBlank(message="Enter your Email id")
	private String email;
	
	@Column(length=30,nullable=false,unique=true)
	@NotBlank(message="Enter your phone no")
	private int phoneNo;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Enter your game name")
	private String game;
	

}
