package view;

public class Ex02DivisionAsThrow {
	public static void main(String[] args) {
		// Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm báo đoạn mã
		// 2.2 Throw/Throws

		System.out.println("D1: " + divide(5, 5));
		System.out.println("D2: " + divide(2, 0));
		System.out.println("D3: " + divide(4, 2));

	}
	
	// throws ArithmeticException => ai gọi nó thì ko bắt buộc xử lý (optional)
	// throws IOException => ai gọi nó thì bắt buộc phải xử lý

	// No needs to throws runtime exception --> unnecessary
	// Not required to process (try/catch || throw/throws) at calling place
	private static int divide(int a, int b) /* throws ArithmeticException */ {
		return a / b;
	}

}
