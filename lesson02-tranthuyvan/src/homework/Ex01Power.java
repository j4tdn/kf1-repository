package homework;

import static java.lang.Math.*;

/**
 * Bài 1: Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không
 * VD: 2^a = n. Điều kiện a là số nguyên (1 2 3 4 5 6)
 * n : 2 4 8 16 32 64 >> is power of 2
 * n : 6 12 15 17 30 50 >> is not power of 2 
 */

public class Ex01Power {
	public static void main(String[] args) {
		int[] numbers = {0, 2, 4, 6, 18, 23, 64, 50};
		for (int number : numbers) {
			System.out.println("==> " + isPowerOfTwo(number));
		}
	}
	
	private static boolean isPowerOfTwo(int n) {
		double base = log(n) / log(2);
		
		System.out.println(n + "--> " + base);
		
		return ceil(base) == floor(base); // ceil: làm tròn trên; floor: làm tròn dưới
		
	}

}
