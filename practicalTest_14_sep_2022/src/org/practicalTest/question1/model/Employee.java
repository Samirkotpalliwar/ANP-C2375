package org.practicalTest.question1.model;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private Date joiningDate;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, Date joiningDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", joiningDate=" + joiningDate
				+ "]";
	}
	
	

}
