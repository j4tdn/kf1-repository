package homework;

public class Ex06 {
	public static void main(String[] args) {
		int count = 0,run = 0;
		while (true) {
			if (isPrime(run)) count ++;
			if (count == 200) break;
			run ++;
		}	
		System.out.println(run);
	}
	private static boolean isPrime (int n) {
		if (n == 0 || n == 1) return false;
		for (int i = 2 ; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
	
}
