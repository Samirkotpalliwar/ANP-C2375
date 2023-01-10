package com.anudip.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
@Table(name = "UserInfo")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(length = 25,nullable = false)
	@NotBlank(message = "Enter Your First Name")
	private String firstName;
	
	@Column(length = 25,nullable = false)
	@NotBlank(message = "Enter Your Last Name")
	private String lastName;
	
	@Column(length =25,nullable = false,unique = true)
	@Email(message = "Enter Your Email")
	private String email;
	
	@Column(length = 10,nullable = false,unique = true)
	@NotNull(message = "Enter Phone Number")
	private long phone;

	@OneToOne(cascade = CascadeType.ALL)
	private MyCart mycart;
	

}
