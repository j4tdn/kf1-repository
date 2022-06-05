package polymorphism.object;

public class PolyAppDemo {
	public static void main(String[] args) {
		
		Shape squareShape = new Square();
		squareShape.draw();
		squareShape.cals();
		
		System.out.println("===============");
		
		Shape rectShape = new Rectangle();
		rectShape.draw();
		rectShape.cals();
		
		squareShape = rectShape;
		
		shapeX
	}
	
		
}
