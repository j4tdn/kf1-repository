package view;

import inheritance.iinterface.Rectangle;
import inheritance.iinterface.Shape;

public class AppDemo {
	public static void main(String[] args) {
		// anonymous class
		Shape shape = new Rectangle();
		shape.draw();
		
		// EmailService service = new StandardEmailService();
		// service.login();
	}
}
