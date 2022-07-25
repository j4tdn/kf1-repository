package view;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabbbbaaabbccccccaaaaa";
		longestCorrectSub(s);
	}
	
	public static void longestCorrectSub(String s) {
		int longest = 1;
		int start = 0;
		int firstIndex = 0, lastIndex = 0;
		int count = 1;

		for(int i = 1; i < s.length();i++ ) {
			
			if(s.charAt(i) == s.charAt(i-1)) {
					count++;
					continue;
			}
			if(count > longest) {
				longest = count;
				firstIndex = start;
			}
			count = 1;
			start = i;
			
		}
		lastIndex = firstIndex + longest;
		System.out.println("Longest String: " + longest + "," + s.substring(firstIndex, lastIndex) 
							+ "[" + firstIndex + "]");

	}
}


