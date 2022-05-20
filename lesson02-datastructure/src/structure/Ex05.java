package structure;

import static java.lang.Math.*;

import bean.Circle;
import bean.CirclePosType;
import bean.Point;

public class Ex05 {
	// StatusCode: Success, Error. Warning
	// CirclePosType: Outside, Inside, Onsite
	// Color: Yellow, Red, Blue, Green
	// ==> Enumeration
	private static final String OUTSIDE = "Ngoài đường tròn";
	private static final String INSIDE = "Trong đường tròn";
	private static final String ONSIDE = "Trên đường tròn";
	
	public static void main(String[] args) {
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 12);	
		
		CirclePosType position = getPos(pA, circle);
		System.out.println("Vị trí: " + position.getValue());
		
		if (position.equals(INSIDE)) {
			System.out.println("Vẽ đoạn thẳng nối O với A");
		} else {
			System.out.println("Không đúng điều kiện");
		}
	}
	
	// TRONG - TRÊN - NGOÀI
	private static CirclePosType getPos(Point point, Circle circle) {
		Point pO = circle.getPoint();
		double R = circle.getR();
		double distance = sqrt(pow(point.getX() - pO.getX(), 2) + pow(point.getY() - pO.getY(), 2));
		
		if (distance > R) {
			return CirclePosType.Outside;
		} else if (distance == R) {
			return CirclePosType.Onside;
		} else {
			return CirclePosType.Inside;
		}
	
	
	
	
	}

}
