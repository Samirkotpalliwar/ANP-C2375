package com.startravels.dao;

import com.startravels.model.BookingDetails;

public class BookingDetailsDao{

	BookingDetails[]BookingDetailsArray=new BookingDetails[10];
	
	static int i=0;
	public String addBookingDetails(BookingDetails bookingDetails) {
		// TODO Auto-generated method stub
		BookingDetailsArray[i]=bookingDetails;
		i++;
		return "Succesfully added Booking Details";
		
	}

}
