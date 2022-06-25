package view;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year a birth
 * --> Calculate age of candidate
 */

public class Ex01AgeCalculatorAsValidation {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String yearAsString = null;

		// Otp1: Validate --> Required yearAsString must be a sequence of number
		do {
			System.out.println("Enter candidate birthyear: ");
			yearAsString = ip.nextLine();
			if (yearAsString.matches("[\\d]+")) {
				break;
			}
			System.out.println("Invalid");
		} while(true);

		Integer birthYear = Integer.parseInt(yearAsString);

		System.out.println("Year: " + birthYear);

		System.out.println("Age: " + (Year.now().getValue() - birthYear));

	}
	
	

}
