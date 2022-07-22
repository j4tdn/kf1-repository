package immutable;

public class Ex02Mutable {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "to";
		String s3 = "class";
		
		String s = s1 + s2 + s3;
		
		StringBuilder s = new StringBuilder();
		
		System.out.println("s hash " + System.identityHashCode(s));
		
		s.append(s1).append(s2).append(s3);
	}
}
