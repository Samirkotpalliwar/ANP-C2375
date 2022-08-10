package org.mycompany.view;
import org.mycompany.model.*;
import org.mycompany.service.*;
public class Employeeview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee member1=new Employee();
		Employee member2=new Employee(5,'u',12000);
		
		
		
		Employeeservice salaryIncrement=new Employeeservice();
		
		System.out.println("Before updation");
		 System.out.println("Employee salary="+member1.getEmployeeSalary());
		 
		 
		Employee emp=salaryIncrement.calculateSalaryIncrement(member1);
		
		 System.out.println("After updation");
		 
		System.out.println("Employee Id="+member1.getEmployeeId());
		System.out.println("Employee salary="+member1.getEmployeeSalary());
		System.out.println("Employee Initial="+member1.getEmployeeInitial());
	 
	  

	}

}
