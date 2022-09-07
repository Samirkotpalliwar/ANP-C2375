package com.startravels.service;

import com.startravels.dao.BookingDetailsDao;
import com.startravels.dao.BusDao;
import com.startravels.model.BookingDetails;
import com.startravels.model.Bus;

public class BookingDetailsService {

	BookingDetailsDao bookingDetailsDao=new BookingDetailsDao();
	
	BusDao busDao=new BusDao();
	
	public String addBookingDetails(BookingDetails bookingDetails) {
		// TODO Auto-generated method stub
		Bus bus=busDao.getBusByBusId(bookingDetails.getBusId());
		if(bookingDetails.getBookedSeat()<= bus.getTotalSeat()) {
			busDao.updateTotalSeat(bus.getTotalSeat()-bookingDetails.getBookedSeat(),bookingDetails.getBusId());
			return bookingDetailsDao.addBookingDetails(bookingDetails) ;
		}
		
		return "bus Doesn't have enoghs seat";
	}

}
