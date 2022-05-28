package lambda.expression;

public class LambdaDemo {
	public static void main(String[] args) {
		int[] numbers = {1 ,10 ,7 ,0 , 20 , 15};
		Condition evenCondition = new Condition() {
			@Override
			public boolean test(int element) {
			
				return element % 2 == 0;
			}
		};
		
	}
	private static int[] findElement(int[] numbers,Condition condition) {
		int[] result = new int[numbers.length];
		int count =0;
		for (int number : numbers) {
			if (condition.test(number))
			{
				result[count++] = number;
			}
		}
		
		return result;
		
	}
}
