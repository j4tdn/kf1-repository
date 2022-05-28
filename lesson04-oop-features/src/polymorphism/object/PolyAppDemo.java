package polymorphism.object;


import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;

import javax.swing.JButton;

import polymorphism.object.ShapeFactory.ShapeType;

public class PolyAppDemo {
	public static void main(String[] args) {
		// Cha: a, b     d
		// Con:       c
		// Con con = new Cha();
		// con.c();
		
		Shape squareShape = new Square();
		squareShape.draw();
		squareShape.cals();
		
		System.out.println("===============");
		
		Shape rectShape = new Rectangle();
		rectShape.draw();
		rectShape.cals();
		
		squareShape = rectShape;
		
		// Đa hình trong đối tượng
		// 1. Factory Pattern ==> Che giấu việc khởi tạo của đối tượng
	    // 2. Dễ dàng convert, chuyển đổi kiểu dữ liệu
		
		Shape shapeX = ShapeFactory.getShape(ShapeType.RECT);
		shapeX.draw();
		shapeX.cals();
		
		Calendar c = Calendar.getInstance();
		c.get(Calendar.MINUTE);
		
	}
}
