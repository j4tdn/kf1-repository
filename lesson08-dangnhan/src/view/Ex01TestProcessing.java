package view;

import java.util.Scanner;

public class Ex01TestProcessing {
	public static void main(String[] args) {
		
		String str = "Welcome to Java08";
		
		for(int i = 0; i< str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("======");
		
		String[] words = str.split("\\s+");
		for(String word : words) {
			System.out.println(word);
		}
		System.out.println("=======");
		
		
		for(int i = str.length() - 1;i >=0 ;i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("=======");
		
		
		for (int i = words.length - 1; i>=0 ; i--) {
			System.out.println(words[i]);
		}
		
	}
}
