package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// HashSet: unordered, unsorted , unique
		// TreeSet: sorted unique Set <E extends Comparable<E>
		// LinkedHashSet: unique order unsorted
		Set<String> items = new HashSet<>();
		items.add("Item 7");
		items.add("Item 22");
		items.add("Item 14");
		items.add("Item 33");
		items.add("Item 33"); // auto remove duplicate values

		print(items);
	}

	private static void print(Set<String> set) {
		for (String item : set) {
			System.out.println(item);
		}
	}
}
