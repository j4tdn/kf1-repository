package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String password;
		
		while(true) {
			try {
				System.out.println("Insert password");
				password = sc.nextLine();
				if (validatePassword(password)) {
					System.out.println("valid");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
				
			}
		}
	}
	
	private static boolean validatePassword (String password) throws InvalidPasswordException {
		
		if (password == null) {
			throw new NullPointerException(">>>>>>>> Password can not be null");
		}
		if(password.length() < 8) {
			throw new InvalidPasswordException(" At least 8 characters");
		}
		
		if (password.length() > 256) {
			throw new InvalidPasswordException("Cannot more than 256 characters");
		}
		
		if(!atLeastOneLowerLetter(password)) {
			throw new InvalidPasswordException("At least one lower letter");
		}
		
		return true;
	}
	
	private static boolean atLeastOneLowerLetter(String password) {
		for (int i =0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if(letter >= 'a' && letter <= 'z') return true;
		}
		return false;
	}
}
