package polymorphism.objectt;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Rectangle ==> draw");
	}
	@Override
	void cals() {
		System.out.println("Rectangle ==> width * height");
	}
}
