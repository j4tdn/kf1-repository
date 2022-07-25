package view;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> p1 = findDivisors(75);
		
		List<Integer> p2 = findDivisors(95);
		
		if(p1.equals(p2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
	}
	public static List<Integer> findDivisors(int m) {
		List<Integer> divisors = new ArrayList<>();
		for(int i = 2; i <= m; i++) {
			if(m % i == 0 && isPrime(i)) {
				divisors.add(i);
			}
		}
		return divisors;
	}
	
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	
}
