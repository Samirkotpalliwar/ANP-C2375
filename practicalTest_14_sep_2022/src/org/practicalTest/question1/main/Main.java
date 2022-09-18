package org.practicalTest.question1.main;

import java.text.ParseException;
import java.util.Scanner;

import org.practicalTest.question1.view.EmployeeView;

public class Main {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		System.out.println("1.start Applicaton");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: displayMainMenu();
		       break;
		default:System.out.println("Enter Correct Choice");   
		}
	}
	public static void displayMainMenu() throws ParseException {
		EmployeeView employeeView=new EmployeeView();
		
		while(true) {
		System.out.println("1.add employee details");
		System.out.println("2.Display employee  Details");
		System.out.println("3.Start application");
		System.out.println("Enter Correct Choice");
		int choice=sc.nextInt();
	
		switch(choice) {
		case 1:employeeView.addEmployeeDetails();
		       break;
		       
		case 2:employeeView.displayEmployeeDetails();
		}

}
}
}