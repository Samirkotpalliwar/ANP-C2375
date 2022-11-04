package com.anudip.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="Actor_Details")
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="Name cannot be blank")
	private String name;
	
	@Column(length=3,nullable=false)
	@NotBlank(message="age cannot be blank")
	private int age;
	
	@Column(length=12,nullable=false)
	@NotNull(message="Number cannot be blank")
	private Long number;
	
	@Column(length=25,nullable=false)
	@NotNull(message="Faceshape cannot be blank")
	private String faceshape;
	
	@Column(length=4,nullable=false)
	@NotNull(message="Height cannot be blank")
	private float height;
	
	@Column(length=25,nullable=false)
	@NotNull(message="colour cannot be blank")
	private String colour;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getFaceshape() {
		return faceshape;
	}
	public void setFaceshape(String faceshape) {
		this.faceshape = faceshape;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	

	
}

