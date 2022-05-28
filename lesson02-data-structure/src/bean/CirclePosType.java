package bean;

public enum CirclePosType {
	// Lưu trữ 1 tập các giá trị là hằng số và số lượng không đổi, chỉ được định nghĩa giá trị trong enum này --> private constructor
	// Có 2 cách để lưu trữ
	// 1. Tên của enum Onside, Outside, Inside
	// 2. Tên cùng với giá trị định nghĩa: Onside("Trên đường tròn"), Outside(Ngoài đường tròn), Inside("Trong đường tròn")
	
	// Onside,  // CirclePosType Onside = new CirclePosType();
	// Outside, // CirclePosType Outside = new CirclePosType();
	// Inside // CirclePosType Inside = new CirclePosType();
	
	Onside("Trên đường tròn"),  // CirclePosType Onside = new CirclePosType("Trên đường tròn");
	Inside("Trong đường tròn"),  // CirclePosType Inside = new CirclePosType("Trong đường tròn");
	Outside("Ngoài đường tròn"); // CirclePosType Outside = new CirclePosType("Ngoài đường tròn"); 
	
	
	private String value;
	
	// private constructor
	CirclePosType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
