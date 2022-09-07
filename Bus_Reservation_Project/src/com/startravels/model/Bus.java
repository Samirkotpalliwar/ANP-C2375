package com.startravels.model;

public class Bus {

	private int busId;
	private String busRegistrationNumber;
	private BusType busType;
	private int totalSeat;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bus(int busId, String busRegistrationNumber, BusType busType, int totalSeat) {
		super();
		this.busId = busId;
		this.busRegistrationNumber = busRegistrationNumber;
		this.busType = busType;
		this.totalSeat = totalSeat;
	}

	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusRegistrationNumber() {
		return busRegistrationNumber;
	}
	public void setBusRegistrationNumber(String busRegistrationNumber) {
		this.busRegistrationNumber = busRegistrationNumber;
	}
	public BusType getBusType() {
		return busType;
	}
	public void setBusType(BusType busType) {
		this.busType = busType;
	}
	
	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRegistrationNumber=" + busRegistrationNumber + ", busType=" + busType
				+ ", totalSeat=" + totalSeat + "]";
	}
	
	

}
