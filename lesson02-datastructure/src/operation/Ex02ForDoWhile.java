package operation;

import java.util.Random;
import java.util.Scanner;

public class Ex02ForDoWhile {
	private static Random rd = new Random();
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int n = rd.nextInt(14); // 0-13
		int n = 8 + rd.nextInt(14-8+1); // from 8 to 14		
		printFor(n);
		printWhile(n);
		printDoWhile(n);
		
		System.out.println("===================");
		// Nhập vào 1 số nguyên N hợp lệ
		
		String numberAsString = "";
		// validation
		do {
			System.out.println("Enter number: " );
			numberAsString = ip.nextLine();
		} while(!numberAsString.matches("[0-9]+")); 
		
		int number = Integer.parseInt(ip.nextLine());
		System.out.println("number: " + number);
	}
	
	// for --> Duyệt mảng, danh sách
	private static void printFor(int n) {
		System.out.print("FOR " + n + ": ");
		for (int i = 0; i < n; i++) { // 1 2 3 
			System.out.println(i + " "); // body
			// Flow: 1 => 2 => Body => 3 Về lại 2 => 3... đến khi 2 ko thỏa mãn thì thoát vòng lặp
		}
	}
	
	// while --> logic
	private static void printWhile(int n) {
		System.out.print("\nWHILE " + n + ": ");
		int i = 0;
		while(i < n) {
			System.out.println(i + " ");
			i++;
		}
	}
	
	// DO WHILE
	
	private static void printDoWhile(int n) {
		System.out.print("\nDO WHILE " + n + ": ");
		int i = 0;
		do {
			System.out.println(i + " ");
			i++;
		} while (i < n);
	}
}
