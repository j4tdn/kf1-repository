package polymorphism.object;

public class Square extends Shape {
	@Override
	void drawing() {
		System.out.println("Square ==> draw");
	}
	
	@Override
	void cals() {
		System.out.println("Square ==> double side");
	}

}
