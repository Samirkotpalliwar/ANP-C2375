package com.anudip.jpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class MyCart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private float totalPrice;
	
	 
	 @OneToMany(mappedBy = "cart")
	 @JsonManagedReference
	 private List<CartItem> cartIteam;

	
	 
}
