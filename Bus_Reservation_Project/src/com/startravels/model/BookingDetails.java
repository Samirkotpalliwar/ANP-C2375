package com.startravels.model;

public class BookingDetails {
	private int busId;
	private int routeId;
	private Passenger passengerDetails;
	private int ticketCharges;
	private int bookedSeat;
	
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public BookingDetails(int busId, int routeId, Passenger passengerDetails, int ticketCharges, int bookedSeat) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.passengerDetails = passengerDetails;
		this.ticketCharges = ticketCharges;
		this.bookedSeat = bookedSeat;
	}


	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public Passenger getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(Passenger passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

	public int getTicketCharges() {
		return ticketCharges;
	}

	public void setTicketCharges(int ticketCharges) {
		this.ticketCharges = ticketCharges;
	}
	

	public int getBookedSeat() {
		return bookedSeat;
	}


	public void setBookedSeat(int bookedSeat) {
		this.bookedSeat = bookedSeat;
	}


	@Override
	public String toString() {
		return "BookingDetails [busId=" + busId + ", routeId=" + routeId + ", passengerDetails=" + passengerDetails
				+ ", ticketCharges=" + ticketCharges + ", bookedSeat=" + bookedSeat + "]";
	}
    
	
	
	

}
