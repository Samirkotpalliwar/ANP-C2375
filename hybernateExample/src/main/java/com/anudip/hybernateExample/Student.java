package com.anudip.hybernateExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")

public class Student {
	
	@Id
	@GeneratedValue
	@Column(length=3)
	private int sid;
	
	@Column(length=30,nullable=false)
	private String sname;
	
	@Column(length=2,nullable=false)
	private int sage;
	
	@Column(length=30,nullable=false)
	private String semail;
	
	@Column(length=13,nullable=false,unique=true)
	private long sphone;
	
	@Column(length=30,nullable=false,unique=true)
	private String sedu;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public long getSphone() {
		return sphone;
	}
	public void setSphone(long sphone) {
		this.sphone = sphone;
	}
	public String getSedu() {
		return sedu;
	}
	public void setSedu(String sedu) {
		this.sedu = sedu;
	}
	
	

}
