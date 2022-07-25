package view;
// String S = "aod34fwfaf532wawfa1223r"

public class Ex08 {
	public static void main(String[] args) {
		String s = "aod34fwfaf532wawfa1223r";
		int max = Integer.MIN_VALUE;
		String[] numbers = s.split("[a-zA-Z]+");
		for (String number: numbers) {
			try {
				int stringToNumber = Integer.parseInt(number);
				if (stringToNumber > max) {
					max = stringToNumber;
				}
			}catch(NumberFormatException e) {
				
			}
		}
		System.out.println(max);
	}
}
