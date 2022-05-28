package polymorphism.objectt;

public class Square extends Shape {
	@Override
	void draw() {
		System.out.println("square ==> draw");
	}@Override
	void cals() {
		System.out.println("Square ==> side square");
	}
}
