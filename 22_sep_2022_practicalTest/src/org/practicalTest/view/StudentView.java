package org.practicalTest.view;

import java.util.Scanner;

import org.practicalTest.model.Student;
import org.practicalTest.service.StudentService;
 
public class StudentView {
	static Scanner sc=new Scanner(System.in);
	 StudentService studentService=new StudentService();
	
	
	public void acceptStudentData() {
		System.out.println("Enter 10 Student Details"); 
		for(int i=0;i<10;i++) {
		
		
		System.out.println("Enter Student Details");
		System.out.println("Enter Student Id");
		int id=(sc.nextInt());
		
		System.out.println("Enter Student Age");
		int Age=(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Student First Name");
		String FirstName=(sc.nextLine());
		
		System.out.println("Enter Student Last Name");
		String LastName=(sc.nextLine());
		
		System.out.println(studentService.setStudent(new Student(id,Age,FirstName,LastName)));
	}
		
	}
	
	
	}
	