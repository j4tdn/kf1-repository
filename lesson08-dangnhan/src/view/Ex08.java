package view;
// String s = "abcdsa234a355" 


public class Ex08 {
	public static void main(String[] args) {
		String s = "abcdsa234a355";
		String[] numbers = s.split("[a-z]+");
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i < numbers.length; i++ ) {
			if (!numbers[i].isEmpty()  && Integer.parseInt(numbers[i]) > max) {
				max = Integer.parseInt(numbers[i]);
			}
		}
		System.out.println("Max: " +max);
	}
}
