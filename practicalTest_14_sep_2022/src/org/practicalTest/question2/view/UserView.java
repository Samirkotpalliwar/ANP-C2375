package org.practicalTest.question2.view;

import java.util.Scanner;

import org.practicalTest.question2.exception.PasswordFormatException;
import org.practicalTest.question2.model.User;
import org.practicalTest.question2.service.UserService;

public class UserView {
	UserService userService=new UserService();
	static Scanner sc=new Scanner(System.in);
	
	
	public void getUserDetails() {

		User user=new User();
		
		System.out.println("add user name");
		user.setUsername(sc.nextLine());
		
		System.out.println("add password here");
		user.setPassword(sc.nextLine());
		
		try {
			System.out.println(userService.setUser(user));
		} catch (PasswordFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Warning:"+e.getMessage());
			System.out.println("Enter Details Again");
			System.out.println();
		}
		
			
	}
	public void displayUserDetails() {
		  User[] user=userService.displayUserDetails();
			int i=0;
			while(user[i]!=null) {
				System.out.println(user[i]);
				i++;
        }

    }
}