package view;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	/* Kiểm tra một số có phải là số hạnh phúc không, biết rằng số hạnh phúc là số
	nguyên dương và khi lặp lại công thức tổng bình phương các chữ số đơn vị bên trong nó
	liên tục ta sẽ được kết quả bằng 1. Nếu khi tổng bình phương các số có kết quả bị trùng
	lặp không tiến về 1 thì số đó không phải là số hạnh phúc */
	public static void main(String[] args) {
		System.out.println(isHappyNumber(1));
		System.out.println(isHappyNumber(7));
		System.out.println(isHappyNumber(19));
		System.out.println(isHappyNumber(4));
		System.out.println(isHappyNumber(100));
	}
	private static boolean isHappyNumber(int a) {
		Set<Integer> integerSet = new HashSet<>();
		while(true) {
			if (a == 1) {
				return true;
			} 
			if (!(integerSet.add(a))) {
				return false;
			}
			int newValue = 0;
			while (a > 0) {
				newValue += (a % 10) * (a % 10);
				a /= 10;
			}
			a = newValue;
		}
		
	}
}
