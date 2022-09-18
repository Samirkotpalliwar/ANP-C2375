package org.practicalTest.question1.DAO;

import org.practicalTest.question1.model.Employee;

public class EmployeeDAO {
    
	Employee[]employeeArray=new Employee[10];
	static int i=0;
	public String setEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeArray[i]=employee;
		i++;
		return "successfully added the employee deatils";
	}
	public Employee[] displayEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeArray;
	}

}
