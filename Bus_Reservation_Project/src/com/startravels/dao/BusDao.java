package com.startravels.dao;

import com.startravels.model.Bus;

public class BusDao {

	static Bus[]busArray=new Bus[10];
	
	static int i=0;
	
	public String addBusDetails(Bus bus) {
		// TODO Auto-generated method stub
		busArray[i]=bus;
		i++;
		return "Succesfully added Bus Details";
	}

	public Bus[] displayBusDetails() {
		// TODO Auto-generated method stub
		return busArray;
	}

	public Bus getBusByBusId(int busId) {
		// TODO Auto-generated method stub
		for(int j=0;j<busArray.length;j++) {
			if(busId==busArray[j].getBusId()) {
				return busArray[j];
			}
		}
		return null;
	}

	public void updateTotalSeat(int totalSeat, int busId) {
		// TODO Auto-generated method stub
		for(int j=0;j<busArray.length;j++) {
			if(busId==busArray[j].getBusId()) {
				busArray[j].setTotalSeat(totalSeat);
				break;
			}
		}
		
	}

}
