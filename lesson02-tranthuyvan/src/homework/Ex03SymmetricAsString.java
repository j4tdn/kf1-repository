package homework;

/**
 * Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
--------------------------------------------------------------------------------------------------
VD: 121 13331 là số đối xứng.
 */

public class Ex03SymmetricAsString {
	public static void main(String[] args) {
		System.out.println(isSymmetric(121));
	}
	
	private static boolean isSymmetric(int n) {
		return n == reverse(n);
	}
	
	// 245(input) >> 542(result)
	private static int reverse(int input) {
		int rev = 0; // rev=5
		while(input > 0) { // 245
			int mod = input % 10;       // mod = 5, 4, 2
			rev = rev*10 + mod;         // rev=5, 5*10+4=54, 54*10+2=542
			input = input / 10;         // 24  2   0
		}
		return rev;
	}
}

