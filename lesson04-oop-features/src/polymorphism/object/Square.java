package polymorphism.object;

public class Square extends Shape{
	@Override
	void draw() {
		System.out.println("square ==> draw ...");
	}
	
	@Override
	void cals() {
		// size, side
		System.out.println("square ==> double side");
	}
}
