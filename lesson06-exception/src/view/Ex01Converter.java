package view;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth
 * --> Calculate age of candidate
 *
 */
public class Ex01Converter {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String yearAsString = null;
		
		// Option 1: Validate --> Required yearAsString must be a sequence of number
		while(true) {
			System.out.print("Enter candidate birthyear: ");
			yearAsString = ip.nextLine();
			// matches('[\\d]+')
			if (isValidStringAsNumber(yearAsString)) {
				break;
			}
			System.out.println(">>> Invalid");
		}
		
		Integer birthYear = Integer.parseInt(yearAsString);
		
		System.out.println("Year: " + birthYear);
		
		System.out.println("Age: " + (Year.now().getValue() - birthYear));
	}
	
	// Kiểm tra 1 phần tử có tồn tại trong mảng hay không
	// Kiểm tra mảng có chứa phần tử chẵn/lẻ... hay không
	
	private static boolean isValidStringAsNumber(String text) {
		// 123 777x88
		for (int i = 0; i < text.length(); i++) {
			if (!Character.isDigit(text.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
