package operation;

import java.util.Scanner;

public class Ex01IfElseSwitchCase {
	
	enum Level {
		Bad, Intermediate, Good
	}
	
	// In ra học lực của học sinh từ điểm
	public static void main(String[] args) {
		// validate <=0 score <= 10 
		Scanner ip = new Scanner(System.in);
		double score = 0;
		while(true) {
			System.out.print("Enter score(0-10): " );
			score = Double.parseDouble(ip.nextLine());
			
			if (score >= 0 && score <= 10) {
				break;
			}
		}
		
		// 0 - 4.9: Bad
		// 5 - 7.9: Intermediate
		// 8 - 10: Good
		Level level ;
		if (score < 5) {
			level = Level.Bad;
		} else if (score < 8) {
			level = Level.Intermediate;
		} else {
			level = Level.Good;
		}
		
		System.out.println(level);
		
		System.out.println("==========================");
		// In ra tháng trong năm ở dạng text từ số
		// 1  --> January
		// 2  --> February
		// 3  --> March
		// 12 --> December
		int month = 2;
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
			// else if until 11
		} else {
			System.out.println("December");
		}
		
		System.out.println("\n======\n");
		
		switch (month) {
		case 1: // month == 1
			System.out.println("January");
			break;
		case 2: // month == 2
			System.out.println("February");
			break;
		case 3: // month == 3
			System.out.println("March");
			break;
			// 4 5 6 7 8 9 10 11
		case 12: // month == 12
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month");
		}
		
	}
}
