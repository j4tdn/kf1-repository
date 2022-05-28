package structure;

public class Ex06Operator {
	public static void main(String[] args) {
		int count = 0; // 1

		if (count > 0 && count++ > 1) {
			System.out.println("step 1: " + count++); // X
		}

		if (count >= 1 || ++count > 2) {
			System.out.println("step 2: " + count);  // X
		}
		
		// AND OR XOR NOT operator
		//  &   |  +  !
		
		// count 1
		if (count >= 2 && ++count >= 4) {
			System.out.println("step 3: " + count--); // X
		}

		System.out.println("step 4: " + count);       // 2
	}
}
