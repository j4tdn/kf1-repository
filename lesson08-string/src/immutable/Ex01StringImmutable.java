package immutable;

public class Ex01StringImmutable {
	public static void main(String[] args) {
		// String literal, constant pool
		String l1 = "Hello";
		String l2 = "Hello";
		String l3 = "Bye";
		System.out.println(System.identityHashCode(l1));
		System.out.println(System.identityHashCode(l2));
		System.out.println(System.identityHashCode(l3));

		// String object
		String o1 = new String("Hello");
		String o2 = new String("Hello");
		String o3 = new String("Bye");
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));

		l1 = "something";
		System.out.println(System.identityHashCode(l1));
	}
}
