package map;

import bean.Item;

public class Ex00HashcodeEqualsExplain {
	public static void main(String[] args) {
		//Object --> hashcode,equals
		
		//Mặc định
		// identityHashCode(Static) luôn luôn là địa chỉ đối tượng
		// hashcode(non static): địa chỉ ô nhớ mà JVM cấp pháp đối tượng
		// Equals: so sánh địa chỉ 2 ô nhớ
		Item item1 = new Item(1, "Item 1", 100, 101);
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		//  sử dụng/override hashcode trong các cấu trúc dữ liệu mã băm 
		// như Set, Map, HashTable
		Item item2 = new Item(1, "Item 1", 100, 101);
		System.out.println(item1.equals(item2));
		
		//sử dụng/override equals: List, Set, Map
		
		// lưu ý: số thuộc tính trong hashcode và equals phải giống nhau

	}
}
