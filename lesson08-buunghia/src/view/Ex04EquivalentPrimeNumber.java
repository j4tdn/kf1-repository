package view;

public class Ex04EquivalentPrimeNumber {
	public static void main(String[] args) {
		System.out.println(isEquivalentPrime(10,20));
		System.out.println(isEquivalentPrime(10,30));
		System.out.println(isEquivalentPrime(6,18));
		System.out.println(isEquivalentPrime(15,75));
		System.out.println(isEquivalentPrime(15,30));
	}

	private static boolean isPrime(int n) {
		if (n == 1 || n == 0) return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isEquivalentPrime(int a, int b) {
		if (a == b) return true;
		int max = (a > b) ? a : b;
		for (int i = 2; i <= max / 2 ; i++) {
			if (isPrime(i)) {
				if ((a % i == 0) != (b % i == 0)) {
					return false;
				}
			}
		}
		return true;
	}
}
