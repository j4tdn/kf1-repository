package ex02;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		int n = numbers.length;
		int[] sorted = new int[n];
		int i = 0;
		while ( i < n) {
			for (int number : numbers) 
				if ( number % 7 == 0 && number % 5 != 0) {
					sorted[i] = number;
					i++;
				}
			for (int number : numbers) 
				if (!(number % 7 == 0 ^ number % 5 == 0)) {
					sorted[i] = number;
					i++;
				}
			for (int number : numbers) 
				if ( number % 5 == 0 && number % 7 != 0) {
					sorted[i] = number;
					i++;
				}
			
		}
		for (int number : sorted)
			System.out.print(number+" ");
		
	}
}
