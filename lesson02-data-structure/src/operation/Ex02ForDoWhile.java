package operation;

import java.util.Random;
import java.util.Scanner;

public class Ex02ForDoWhile {
	private static Random rd = new Random();
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		// int n = rd.nextInt(14);  // 0-13
		 int n = 8 + rd.nextInt(7); // 8-14
		 printFor(n);
		 printWhile(n);
		 printDoWhile(n);
		 
		 System.out.println("===================");
		 // Nhập vào 1 số nguyên N hợp lệ
		 
		 String numberAsString = "";
		 // validation
		 do {
			 System.out.print("Enter number: " );
			 numberAsString = ip.nextLine();
			 if(numberAsString.matches("[0-9]+")) {
				 break;
			 }
			 System.out.println("Invalid");
		 } while(true);
		 
		 int number = Integer.parseInt(numberAsString);
		 System.out.println("number: " + number);
	}
	
	// for --> Duyệt mảng, danh sách 0 1 2 ==>n=5
	private static void printFor(int n) {
		System.out.print("FOR " + n + ": ");
		for (int i = 0; i < n; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i + "  ");
		}
	}
	// while --> logic
	private static void printWhile(int n) {
		System.out.print("\nWHILE " + n + ": ");
		int i = 0;
		/*while(i < n) {
			System.out.print(i + "  ");
			i++;
		}*/

		while(true) {
			System.out.print(i + "  ");
			i++;
			if (i == n) {
				break;
			}
		}
	}
	
	private static void printDoWhile(int n) {
		System.out.print("\nDO WHILE " + n + ": ");
		int i = 0;
		do {
			System.out.print(i + "  ");
			i++;
		} while(i < n);
	}
}
