package view;

import bean.Vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle[] vehicles = mockData();
		System.out.println("Tên chủ xe, Loại xe, Dung tích, Trị giá, Thuế phải nộp");
		System.out.println("=========================================================");
		for (Vehicle vehicle: vehicles) {
			System.out.println(vehicle);
		}
	}
	
	private static Vehicle[] mockData() {
		return new Vehicle[] {
			new Vehicle("Nguyễn Thị Loan", "Future Neo", 100, 35 * 1000 * 1000),
			new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250 * 1000 * 1000),
			new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000 * 1000 * 1000)
		};
	}
}
