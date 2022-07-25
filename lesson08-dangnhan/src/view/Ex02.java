package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String name = null;
		while(true) {
			try {
				name = enterName();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(show(name));
		
	}
	private static String enterName() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		if(!name.matches("[A-Za-z\\s]+")) {
			throw new Exception("Name only contains [A-Za-z]");
		}
		return name;
	}
	
	private static String show(String name) {
		String[] words = name.split("\\s");
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			String formatWord = Character.toUpperCase(word.charAt(0)) + (word.substring(1).toLowerCase());
			sb.append(formatWord).append(' ');
		}
		return sb.toString().trim();
	}
}
