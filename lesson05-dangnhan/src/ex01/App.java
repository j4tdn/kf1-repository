package ex01;

public class App {
	public static void main(String[] args) {
		System.out.println(isPowerOf(16, 4));
		System.out.println(isPowerOf(20, 4));
		
	}
	public static boolean isPowerOf(int a,int b) {
		if (a ==0 || a == 1) return false;
		
		if (b ==0 || b == 1) return false;
		
		while (a!=b) {
			if (a % b !=0) {
				return false;
			}
			a /=b;
		}
		
		return true;
		
	}
}
