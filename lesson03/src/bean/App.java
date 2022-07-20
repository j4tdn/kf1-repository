package bean;

public class App {
	public static void main(String[] args) {
		Vehicle [] vehicles = mockData();
		System.out.println("Ten chu xe , Loai xe,Dung tich,Tri gia, thue phai nop");
		System.out.println("===========================================");
		for (Vehicle vehicle: vehicles) {
			System.out.println(vehicle);
		}
	}
	
	private static Vehicle[] mockData() {
		return new Vehicle[] {
			new Vehicle ("Nguyen Thi Loan", " Future Neo", 100 , 35000000),
			new Vehicle ("Le Minh Tinh", " Ford Ranger", 100 , 125000000),
			new Vehicle ("Nguyen Minh Truet", " Landscape", 1500 , 35000000)
		};
	}
}
