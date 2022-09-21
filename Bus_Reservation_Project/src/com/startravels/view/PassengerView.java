package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.Bus;
import com.startravels.model.Gender;
import com.startravels.model.Passenger;
import com.startravels.service.PassengerService;

public class PassengerView {
	static Scanner sc=new Scanner(System.in);
	PassengerService passengerService=new PassengerService();
	
	public void addPassengerDetails() {
	Passenger passenger=new Passenger();
	
	System.out.println("Enter Passenger Name");
	passenger.setPassengerName(sc.nextLine());
	sc.nextLine();
	
	System.out.println("Enter Mobile Number");
	passenger.setMobileNumber(sc.nextLine());
	
	System.out.println("Enter Address");
	passenger.setMobileNumber(sc.nextLine());
	
	System.out.println("Enter Gender");
	passenger.setGender(Gender.valueOf(sc.nextLine()));
	
	System.out.println(passengerService.addPassengerDetails(passenger));
	
	}

public void displayPassengerDetails() {
		
		Passenger[] passenger=passengerService.displayPassengerDetails();
		int i=0;
		while(passenger[i]!=null) {
			System.out.println(passenger[i]);
			i++;
	}
}
}
