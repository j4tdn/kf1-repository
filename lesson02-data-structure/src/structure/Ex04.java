package structure;

import bean.Circle;
import bean.Point;
import static java.lang.Math.*;

public class Ex04 {
	// StatusCode: Success, Error, Warning
	// CirclePosType: Outside, Inside, Onside
	// Color: Yellow, Red, Blue, Green
	// ===> Enumeration
	private static final String OUTSIDE = "Ngoài đường tròn";
	private static final String INSIDE = "Trong đường tròn";
	private static final String ONSIDE = "Trên đường tròn";
	
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 12);
		
		String position = getPos(pA, circle);
		System.out.println("Vị trí: " + position);
		
		if (position.equals(INSIDE)) {
			System.out.println("Vẽ đoạn thẳng nối O với A");
		} else {
			System.out.println("Không đúng điều kiện");
		}
	}
	
	// TRONG - TRÊN - NGOÀI
	private static String getPos(Point point, Circle circle) {
		Point pO = circle.getPoint();
		double R = circle.getR();
		double distance = sqrt(pow(point.getX() - pO.getX(), 2) + pow(point.getY() - pO.getY(), 2));
		
		// 
		if (distance > R) {
			return OUTSIDE;
		} else if (distance == R) {
			return ONSIDE;
		} else {
			return INSIDE;
		}
	}
}
