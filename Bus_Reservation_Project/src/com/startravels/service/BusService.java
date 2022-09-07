package com.startravels.service;

import com.startravels.dao.BusDao;
import com.startravels.model.Bus;

public class BusService {
 
	BusDao busDao=new BusDao();
	public String addBusDetails(Bus bus) {
		// TODO Auto-generated method stub
		return busDao.addBusDetails(bus);
	}
	
	public Bus[] displayBusDetails() {
		return busDao.displayBusDetails();
		// TODO Auto-generated method stub
		
	}

}
