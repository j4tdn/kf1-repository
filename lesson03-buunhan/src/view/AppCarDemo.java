package view;

import bean.Car;

public class AppCarDemo {
	public static void main(String[] args) {
		Car c1 = new Car("01",  100, 120);
		Car c2 = new Car("02",  200, 240);
		Car c3 = new Car("03",  300, 360);
		// ....................................
		Car c99 = new Car("99",  400, 480);
		
		Car.model = "Vin";
		
		Car.model = "Mazda";
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c99: " + c99);
	}
}
