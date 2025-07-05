package com.restful_webservice.cardata_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	private String carName;
	private String brand;
	private int fuelCapacity;
	private double price;
	private int seatCapacity;
	private String carType;
	
	public CarData() {
		
	}

	public CarData(int carId, String carName, String brand, int fuelCapacity, double price, int seatCapacity,
			String carType) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.brand = brand;
		this.fuelCapacity = fuelCapacity;
		this.price = price;
		this.seatCapacity = seatCapacity;
		this.carType = carType;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "CarData [carId=" + carId + ", carName=" + carName + ", brand=" + brand + ", fuelCapacity="
				+ fuelCapacity + ", price=" + price + ", seatCapacity=" + seatCapacity + ", carType=" + carType + "]";
	}
	
	
	
	
}
