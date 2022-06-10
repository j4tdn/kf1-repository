package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void drawing() {
		System.out.println("Rectangle ==> draw ...");
	}
	
	@Override
	void cals() {
		System.out.println("Rectangle ==> width * height");
	}

}
