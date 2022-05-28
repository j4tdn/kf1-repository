package polymorphism.objectt;

public class ShapeFactory {
	enum ShapeType{
		SQUARE,RECT
	}
	private ShapeFactory() {}
	public static Shape getShape(ShapeType type) {
		if (type.equals(ShapeType.SQUARE))
			return new Square();
		return new Rectangle();
	}
	
}
