package org.practicalTest.question1.service;

import org.practicalTest.question1.DAO.EmployeeDAO;
import org.practicalTest.question1.model.Employee;

public class EmployeeService {
	EmployeeDAO employeeDAO=new EmployeeDAO();

	

	public String setEmpolyee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.setEmployee(employee);
	}



	public Employee[] displayEmployeeDetails() {
		// TODO Auto-generated method stub
		return employeeDAO.displayEmployeeDetails();
	}

}
