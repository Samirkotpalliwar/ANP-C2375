package com.startravels.main;

import java.util.Scanner;

import com.startravels.view.BookingDetailsView;
import com.startravels.view.BusRouteView;
import com.startravels.view.BusView;

public class Main {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.start Applicaton");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: displayMainMenu();
		       break;
		default:System.out.println("Enter Correct Choice");   
		}
		
	}
	
	public static void displayMainMenu() {
		
		
		BusView busview=new BusView();
		
		BusRouteView busRouteView=new BusRouteView();
		
		BookingDetailsView bookingDetailsView=new BookingDetailsView();
      
		while(true) {
		System.out.println("1.Add Bus Details");
        System.out.println("2.Display Bus  Details");
        System.out.println("3.Add Bus Route Details");
        System.out.println("4.Display Bus Route  Details");
        System.out.println("5.Add Booking Details");
        System.out.println("6.Stop Application");
        System.out.println("Enter Your choice");
        int Choice=sc.nextInt();
        
        switch(Choice) {
        case 1:busview.addBusDetails();
               break;
        case 2:busview.displayBusDetails();
               break;
               
        case 3:busRouteView.addBusRouteDetails();
               break;
        case 4:busRouteView.displayBusRouteDetails();
               break;
        case 5:bookingDetailsView.addBookingDetails();
               break;
        case 6:System.exit(0);
               break;
        default: System.out.println("Enter correct choice");;
        }
	}
	}

}
