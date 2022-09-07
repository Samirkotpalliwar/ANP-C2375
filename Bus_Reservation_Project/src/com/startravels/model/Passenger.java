package com.startravels.model;

public class Passenger {
	private String passengerName;
	private String mobileNumber;
	private String address;
	private Gender gender;
	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String passengerName, String mobileNumber, String address, Gender gender) {
		super();
		this.passengerName = passengerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.gender = gender;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", mobileNumber=" + mobileNumber + ", address=" + address
				+ ", gender=" + gender + "]";
	}
		

}
