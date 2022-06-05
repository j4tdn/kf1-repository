package ex02;

public class App {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(10));
		System.out.println(isSpecialNumber(21));
		System.out.println(isSpecialNumber(20));	
	}
	
	public static boolean isSpecialNumber(int a) {
		int b = (int) Math.sqrt(a);
		int c = 2 * a;
		int d = b * (b+1);
		if (c == d) return true;
		else return false;
	}
	
	
	
	
}
