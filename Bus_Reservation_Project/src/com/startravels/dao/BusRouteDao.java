package com.startravels.dao;

import com.startravels.model.BusRoute;

public class BusRouteDao {
	
	BusRoute[]busRouteArray=new BusRoute[10];
	
	int i=0;

	public String addBusRouteDetails(BusRoute busRoute) {
		// TODO Auto-generated method stub
		busRouteArray[i]=busRoute;
		i++;
		
		return "Bus Route Details Succefully added";
	}

	public BusRoute[] displayBusRouteDetails() {
		// TODO Auto-generated method stub
		return busRouteArray;
	}

}
