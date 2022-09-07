package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.Bus;
import com.startravels.model.BusType;
import com.startravels.service.BusService;

public class BusView {

	static Scanner sc=new Scanner(System.in);
	BusService busService=new BusService();
	
	
	public void addBusDetails() {
		Bus bus=new Bus();
		System.out.println("Enter Bus id");
		bus.setBusId(sc.nextInt());
		
		sc.nextLine();
		
		System.out.println("Enter Bus Registration Number");
		bus.setBusRegistrationNumber(sc.nextLine());
		
		System.out.println("Enter Bus Type");
		bus.setBusType(BusType.valueOf(sc.nextLine()));
		
	     System.out.println("Enter Total number of seats");
	     bus.setTotalSeat(sc.nextInt());
	     
	     
		System.out.println(busService.addBusDetails(bus));
	}
	public void displayBusDetails() {
		
		Bus[] buses=busService.displayBusDetails();
		int i=0;
		while(buses[i]!=null) {
			System.out.println(buses[i]);
			i++;
		}
		
	}
}
