package homework;

/**
 * Nhập vào một chuỗi bất kỳ. Kiểm tra chuỗi đó có phải là số đối xứng hay không
--------------------------------------------------------------------------------------------------
VD: 121 13331 là số đối xứng.
 */

public class Ex03Symmetric {
	public static void main(String[] args) {
		String[] sequences = {"123", "abba", "123abba321", "cdef", "45654"};
		for (String sequence: sequences) {
			System.out.println(sequence + "==>" + isSymmetric(sequence) );
		}
		
	}
	// charAt : lấy phần tử ra và so sánh từng phần tử trong một chuỗi
	private static boolean isSymmetric(String input) {
		int length = input.length();
		for (int i = 0; i < input.length()/2; i++) {
			if (input.charAt(i) != input.charAt(length - i -1)) {
				return false;
			}	
		}
		return true;
	}
	
	// abcde --> ab: 5/2 ==> 2 => chỉ cần lấy tới phần tử thứ 0 và 1 (tức xét a và b)
	// abcd --> ab: 4/2 ==> 2 ==> 0,1
	// abcde -> 0&4, 1&3
		
		
		
	
}

