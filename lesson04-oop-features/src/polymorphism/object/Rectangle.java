package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("rectangle ==>draw");
	}
	
	@Override
	void cals() {
		// TODO Auto-generated method stub
		System.out.println("shape ==> wight * height");
	}
	
}
