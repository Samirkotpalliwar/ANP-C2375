package com.anudip.jpa.service;

import java.util.List;

import com.anudip.jpa.entity.Passenger;

//Abstract method for performing CRUD on entity Passenger
public interface PassengerService {

	// Method  for saving passenger details 
	Passenger savePassenger(Passenger pass);
	
	// Method for fetching passenger detail based on pid
	Passenger getPassengerById(long id);
	
	// Method for fetching all passenger details
	List<Passenger>getAllPassengers();
	
	// method for updating passenger details based on pid
	Passenger updatePassengerById(Passenger pass,long id);
	
	// method for removing passenger details based on pid
	void deletePassengerById(long pid);

	

	
}
