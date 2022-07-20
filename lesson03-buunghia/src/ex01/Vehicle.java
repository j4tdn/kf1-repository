package ex01;

public class Vehicle {
	private String name;
	private String model;
	private int capacity;
	private double price;
	public Vehicle() {}
	public Vehicle(String name,String model,int capacity,double price) {
		this.name=name;
		this.model=model;
		this.capacity=capacity;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getTax(){
		if (capacity < 100) return price / 100;
		if (capacity < 200) return 3 * price / 100;
		return price / 20;
	}
	@Override
	public String toString() {
		return String.format("%-25s%-15s%-10d%-15f%-15f",name,model,capacity,price,getTax());
	}
}