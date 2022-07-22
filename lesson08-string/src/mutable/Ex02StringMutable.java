package mutable;

public class Ex02StringMutable {
	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "to";
		String s3 = "class";
		
		//String s = s1 + s2 +s3
		
		StringBuilder s = new StringBuilder();
		System.out.println("s before: " + s);
		System.out.println("s hash before: " + System.identityHashCode(s));
		s.append(s1).append(s2).append(s3);
		System.out.println("s after : " + s);
		System.out.println("s hash after : " + System.identityHashCode(s));
	}
}
