package structure;

import bean.Circle;
import bean.CirclePosType;
import bean.Point;
import static java.lang.Math.*;

public class Ex05 {
	// StatusCode: Success, Error, Warning
	// CirclePosType: Outside, Inside, Onside
	// Color: Yellow, Red, Blue, Green
	// ===> Enumeration
	
	public static void main(String[] args) {
		int xA = 3;
		int yA = 4;
		int zA = 5;
		
		int xB = 3;
		int yB = 4;
		int zB = 5;
		
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 12);
		
		CirclePosType position = getPos(pA, circle);
		System.out.println("Vị trí: " + position.getValue());
		
		if (position.equals(CirclePosType.Inside)) {
			System.out.println("Vẽ đoạn thẳng nối O với A");
			return ; // stop and exit void method
		}
		
		System.out.println("Không đúng điều kiện");
	}
	
	// TRONG - TRÊN - NGOÀI
	private static CirclePosType getPos(Point point, Circle circle) {
		
		Point pO = circle.getPoint();
		double R = circle.getR();
		double distance = sqrt(pow(point.getX() - pO.getX(), 2) + pow(point.getY() - pO.getY(), 2));
		
		if (distance > R) {
			return CirclePosType.Outside;
		}
		
		if (distance == R) {
			return CirclePosType.Onside;
		}
		
		return CirclePosType.Inside;
	}
}
