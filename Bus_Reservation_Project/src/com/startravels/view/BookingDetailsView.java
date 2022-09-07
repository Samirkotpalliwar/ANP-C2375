package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.BookingDetails;
import com.startravels.model.Gender;
import com.startravels.model.Passenger;
import com.startravels.service.BookingDetailsService;

public class BookingDetailsView {

	static Scanner sc=new Scanner(System.in);
	
	BookingDetailsService bookingDetailsService =new BookingDetailsService();
	
	public void addBookingDetails() {
		
		BookingDetails bookingDetails= new BookingDetails();
		
		Passenger passenger=new Passenger();
		System.out.println("Enter Bus Id");
		bookingDetails.setBusId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Route id");
		bookingDetails.setRouteId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Passenger Details");
		
		System.out.println("Enter your Name");
		passenger.setPassengerName(sc.nextLine());
		
		
		System.out.println("Enter your Mobile Number");
		passenger.setMobileNumber(sc.nextLine());
		
		
		System.out.println("Enter your Address");
		passenger.setAddress(sc.nextLine());
		
		System.out.println("Enter your Gender");
		passenger.setGender(Gender.valueOf(sc.nextLine()));
		
		bookingDetails.setPassengerDetails(passenger);
		
	    System.out.println("Ticket Charges");
	    bookingDetails.setTicketCharges(sc.nextInt());
	    
	    System.out.println("Enter number of seats you want to booked");
	    bookingDetails.setBookedSeat(sc.nextInt());
	     
	  System.out.println(bookingDetailsService.addBookingDetails(bookingDetails));
	}
	
}
