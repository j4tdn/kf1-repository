package ex03;

public class App {
	public static void main(String[] args) {
		String s1 = "12abu02muzk586cyx";
		String s2 = "22yk892nn1234uxo2";

		String[] n1 = s1.split("[a-z]+");
		String[] n2 = s2.split("[a-z]+");

		int[] result1 = convert(n1);
		int[] result2 = convert(n2);

		if (getLargestnumber(result1) > getLargestnumber(result2)) {
			System.out.println(getLargestnumber(result2) + "  " + getLargestnumber(result1));
		} else
			System.out.println(getLargestnumber(result1) + "   " + getLargestnumber(result2));

	}

	private static int getLargestnumber(int[] n) {
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}

	public static int[] convert(String[] num) {
		int[] convertToInt = new int[num.length];
		int index = 0;
		for (String n : num) {
			convertToInt[index++] = Integer.parseInt(n);
		}

		return convertToInt;
	}

}

