package bean;

import java.text.DecimalFormat;

public class Vehicle {
	private String vehicleOwner;
	private String model;
	private int capacity;
	private double price;
	
	public Vehicle() {
		
	}

	public Vehicle(String vehicleOwner, String model, int capacity, double price) {
		this.vehicleOwner = vehicleOwner;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getTax() {
		int taxInPercent = 0;
		if(capacity < 100) {
			taxInPercent = 1;
		}
		else if(capacity <= 200) {
			taxInPercent = 3;
		}
		else {
			taxInPercent = 5;
		}
		return price * taxInPercent / 100;
	}

	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("#,###.###");
		return "Vehicle [vehicleOwner=" + vehicleOwner + ", model=" + model + ", capacity=" + capacity + ", price="
				+ price + "]";
	}
	
	
}
