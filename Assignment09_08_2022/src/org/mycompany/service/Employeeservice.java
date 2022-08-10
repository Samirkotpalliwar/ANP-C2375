package org.mycompany.service;

import org.mycompany.model.Employee;

public class Employeeservice {
	 
	  public Employee calculateSalaryIncrement(Employee obj) {
		double salaryIncrement=(obj.getEmployeeSalary()*25/100)+obj.getEmployeeSalary();
		  obj.setEmployeeSalary(salaryIncrement);
		  return obj;
		  
		  

	  }

     
}
