package com.startravels.model;

public class BusRoute {
	private int busId;
	private int routeId;
	private String busSourceCity;
	private String busDestinationCity;
	
	
	public BusRoute() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BusRoute(int busId, int routeId, String busSourceCity, String busDestinationCity) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.busSourceCity = busSourceCity;
		this.busDestinationCity = busDestinationCity;
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
	public String getBusSourceCity() {
		return busSourceCity;
	}
	public void setBusSourceCity(String busSourceCity) {
		this.busSourceCity = busSourceCity;
	}
	public String getBusDestinationCity() {
		return busDestinationCity;
	}
	public void setBusDestinationCity(String busDestinationCity) {
		this.busDestinationCity = busDestinationCity;
	}
	@Override
	public String toString() {
		return "BusRout [busId=" + busId + ", routeId=" + routeId + ", busSourceCity=" + busSourceCity
				+ ", busDestinationCity=" + busDestinationCity + "]";
	}
	
	

}
