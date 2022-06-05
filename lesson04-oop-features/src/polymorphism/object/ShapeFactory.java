package polymorphism.object;

public class ShapeFactory {
	
	enum ShapeType{
		SQUARE, RECT,
	}
	private ShapeFactory() {
		
	}
	private static Shape getShape(ShapeType shapeType) {
		if (shapeType.equals(ShapeType.SQUARE)) {
			return new Square();
		}
		return new Rectangle();
	}
}
