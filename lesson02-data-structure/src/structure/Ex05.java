package structure;

import bean.Circle;
import bean.Point;
import static java.lang.Math.*;
import bean.CirclePosType;

public class Ex05 {
	
	private static final String OUTSIDE = "ngoai duong tron";
	private static final String INSIDE = "trong duong tron";
	private static final String ONSIDE = "tren duong tron";
	
	public static void main(String[] args) {
		Point pA = new Point (5,7);
		Point p0 = new Point (0,0);
		
		int R = 8;
		Circle circle = new Circle(new Point(0,0), 12);
		CirclePosType position = CirclePosType(pA, circle);
		System.out.println("Vi tri " + position.getValue());
	}
	
	private static CirclePosType CirclePosType(Point point, Circle circle) {
		Point p0 = circle.getPoint();
		double R = circle.getR();
		
		double distance = sqrt(pow(point.getX() - p0.getX(), 2) + pow (point.getY() - p0.getY(), 2));
		
		if (distance >R) {
			return CirclePosType.Outside;
		}
		else if (distance == R) {
			return CirclePosType.Inside;
		}
		else {
			return CirclePosType.Onside;
		}
	}
}
