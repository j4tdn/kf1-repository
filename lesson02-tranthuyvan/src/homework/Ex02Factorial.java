package homework;
/**
 * Bài 2: Viết chương trình tính tổng S = 4! +7! + 12! + 18!
 */

public class Ex02Factorial {
	public static void main(String[] args) {
		int[] elements = {4, 7, 12, 18};
		
		long total = 0;
		for (int element: elements) {
			total += fact(element);
		}
		System.out.println("total: " + total );
	}
	
	// n: n*(n-1)*...*2
	private static long fact(int n) {
		long f = n--; // n = 5, f = 6
		while (n > 1) {
			f *= n;
			n--;
		}
		return f;
	}
}