package view;

import bean.Car;

public class AppCarDemo {
	
	
	
	public static void main(String[] args) {
		Car c1 = new Car("O1", 100, 120);
		// c1.model = "Vin";
		Car.model = "Vin";
		
		Car c2 = new Car("O2", 200, 240);
		Car c3 = new Car("O3", 300, 360);
		// ...................
		Car c99 = new Car("99", 900, 990);
		
		// c3.model = "Mazda";
		Car.model = "Mazda";
		
		System.out.println("c1:  " + c1);
		System.out.println("c2:  " + c2);
		System.out.println("c3:  " + c3);
		System.out.println("c99: " + c99);
	}
}
