package operation;

import java.util.Scanner;

public class Ex01 {
		public static void main(String[] args) {
			double score = 0;
			Scanner ip = new Scanner(System.in);
			while(true) {
				System.out.println("Enter Score: ");
				score = Double.parseDouble(ip.nextLine());
				
				if (score >=0 && score <= 10) {
					break;
				}
			}
			
			int month = 2 ;
					
			switch(month) {
			case 1 : {
				System.out.println("January");
				break;
			}
			case 2 : {
				System.out.println("February");
				break;
			}
			case 3 : {
				System.out.println("March");
				break;
			}
			case 12 : {
				System.out.println("December");
				break;
			}
			
		}
}
		

