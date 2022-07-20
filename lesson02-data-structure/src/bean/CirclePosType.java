package bean;

public enum CirclePosType {
	
	
	Onside("tren duong tron"),
	Outside("Ngoai duong tron"),
	Inside("Trong duong tron"),;
	
	private String value;
	CirclePosType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
