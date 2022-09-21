package com.startravels.dao;

import com.startravels.model.Passenger;

public class PassengerDao {
	
	static Passenger[]PassengerArray=new Passenger[10];
    static int i=0;
    
	public String addPassengerDetails(Passenger passenger ) {
		// TODO Auto-generated method stub
		PassengerArray[i]=passenger;
		i++;
		return "Succesfully added Passenger Details";
		
		
	}

	public Passenger[] displayPassengerDetails() {
		// TODO Auto-generated method stub
		return PassengerArray;
	}
	

}
