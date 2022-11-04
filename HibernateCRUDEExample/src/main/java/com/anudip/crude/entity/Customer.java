package com.anudip.crude.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data // combination of getter setter and constructor
@Entity
@Table(name= "cust_details")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 3)
	private int Cid;
	
	@Min(value =3)
	private String cname;
	
	@Column(length =50, nullable = false)
	@NotBlank(message = "address cannot blank")
	private String adr;
	
	
	@Column(length =30, nullable = false, unique = true)
	@NotBlank(message = "customer email cannot blank")
	@Email(message = "Incorrect email Id")
	private String email;
	
	@Column(length =30, nullable = false, unique = true)
	@NotBlank(message = "customer phone cannot blank")
	private long phone;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}
	
	
	
	
}
