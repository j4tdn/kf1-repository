package polymorphism.objectt;

import polymorphism.objectt.ShapeFactory.ShapeType;

public class PolyAppDemo {
	public static void main(String[] args) {
		Shape squareShape = new Square();
		squareShape.draw();
		squareShape.cals();
		Shape rectShape = new Rectangle();
		rectShape.draw();
		rectShape.cals();
		squareShape=rectShape;
		Shape shapeX = ShapeFactory.getShape(ShapeType.RECT);
		
	}
}
