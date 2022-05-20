package homework;
/**
 * Bài 4: Viết chương trình nhập vào một dãy các số nguyên từ bàn phím. Tìm số lẻ lớn nhất trong dãy số và in ra.
 */

public class Ex04MaxOdd {
	public static void main(String[] args) {
		System.out.println("max odd: " + maxOdd(100, 6, -19, 15, 22, -33, 44, 52, -15));
	}
	
	private static int maxOdd(int... digits) {
		int max = Integer.MIN_VALUE;
	
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] % 2 != 0 &&  digits[i] > max) {
				max = digits[i];
			}
		}
		return max;
	}

}
