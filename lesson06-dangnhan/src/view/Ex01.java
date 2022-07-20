package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Insert a: ");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Insert b: ");
				b = Integer.parseInt(sc.nextLine());
				System.out.println("Test : ");
				System.out.println(solveSolution(a, b));
				return;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	
	}
	
	private static double solveSolution(int a, int b) {

		if (a == 0) {
			throw new ArithmeticException("can't divide by zero");
		}

		return (double) -b / a;
	}
}
