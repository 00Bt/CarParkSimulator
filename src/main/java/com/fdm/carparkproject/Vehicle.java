package com.fdm.carparkproject;

public abstract class Vehicle {
	
	private double parkingRate;
	private int vehicleSize;

	protected double getParkingRate() {
		return parkingRate;
	}

	protected void setParkingRate(double parkingRate) {
		this.parkingRate = parkingRate;
	}

	protected double getVehicleSize() {
		return vehicleSize;
	}

	protected void setVehicleSize(int vehicleSize) {
		this.vehicleSize = vehicleSize;
	}

}
