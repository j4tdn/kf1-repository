package lambda.expression;



public class LambdaDemo {
	public static void main(String[] args) {
		
	}
	
	private static int[] findElementCof5(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		for (int number: numbers) {
			if (number % 5 ==0) {
				result[count] = number;
				count++;
			}
		}
		
		int[] finalResult = new int[count];
		for(int i = 0; i< finalResult.length;i++) {
			
		}
	}
}
