package com.startravels.service;

import com.startravels.dao.BusRouteDao;
import com.startravels.model.BusRoute;

public class BusRouteService{
	
	BusRouteDao busRouteDao=new BusRouteDao();


	public String addBusDetails(BusRoute busRoute) {
		// TODO Auto-generated method stub
		return busRouteDao.addBusRouteDetails(busRoute) ;
	}


	public BusRoute[] displayBusRouteDetails() {
		// TODO Auto-generated method stub
		return busRouteDao.displayBusRouteDetails();
	}


	
	
	

}
