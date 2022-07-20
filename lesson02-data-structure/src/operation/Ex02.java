package operation;

import java.util.Random;

public class Ex02 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int n = 8 + rd.nextInt(7);
	}
	
	private static void printFor(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + " ");
		}
	}
	private static void printWhile(int n) {
		System.out.println("\nWhile" + n + " :" );
		int i = 0;
		while(i < n) {
			System.out.println(i + " ");
			i++;
		}
	}
	
	do {
		
	}
}
