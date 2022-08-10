package org.mycompany.model;

public class Employee {
	private int employeeId;
	private char employeeInitial;
	private double employeeSalary;

	public Employee() {
		this.employeeId=4;
		this.employeeInitial='s';
		this.employeeSalary=150000;
		System.out.println("constructor without parameter");
	}
	public Employee(int id,char initial,int salary) {
		this.employeeId=id;
		this.employeeInitial=initial;
		this.employeeSalary=salary;
		System.out.println("constrtuctor with parameter");
	}
	public void setEmployeeId(int id) {
		this.employeeId=id;
	
	}
	public int getEmployeeId() {
		return employeeId;
	}
     public void setEmployeeInitial(char initial) {
    	 this.employeeInitial=initial;
     }
     public char getEmployeeInitial() {
    	 return employeeInitial;
     }
     public void setEmployeeSalary(double salary) {
    	 this.employeeSalary=salary;
     }
     public double getEmployeeSalary() {
    	 return employeeSalary;
     }
     }