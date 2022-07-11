package view;

import java.util.Scanner;

public class Ex01Equation {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a , b;
		
		while (true) {
			try {
				System.out.println("Enter a=");
				a = Double.parseDouble(input.nextLine());
				if (a == 0) throw new ArithmeticException("Divide by zero");
				System.out.println("Enter b=");
				b = Double.parseDouble(input.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Must input a number");
			}
			
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println("x = " +-b/a);
		
	}
}
