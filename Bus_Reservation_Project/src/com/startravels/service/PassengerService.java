package com.startravels.service;

import com.startravels.dao.PassengerDao;
import com.startravels.model.Bus;
import com.startravels.model.Passenger;

public class PassengerService {

	PassengerDao passengerDao=new PassengerDao();
	public String addPassengerDetails(Passenger Passenger) {
		// TODO Auto-generated method stub
		return passengerDao.addPassengerDetails(Passenger);
	}
	public  Passenger[] displayPassengerDetails() {
		// TODO Auto-generated method stub
		return passengerDao.displayPassengerDetails();
	}

}
