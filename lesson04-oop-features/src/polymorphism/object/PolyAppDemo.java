package polymorphism.object;

import polymorphism.object.ShapeFactory.ShapeType;

public class PolyAppDemo {
	public static void main(String[] args) {
		Shape squareShape = new Square();
		squareShape.drawing();
		squareShape.cals();

		System.out.println("========================");

		Shape rectShape = new Rectangle();
		rectShape.drawing();
		rectShape.cals();

		// Đa hình trong đối tượng
		// 1. Factory Pattern ==> che giấu việc khởi tạo của đối tượng
		// 2. Dễ dàng convert, chuyển đổi kiểu dữ liệu

		Shape shapeX = ShapeFactory.getShape(ShapeType.RECT);
		shapeX.drawing();
		shapeX.cals();

	}

}
