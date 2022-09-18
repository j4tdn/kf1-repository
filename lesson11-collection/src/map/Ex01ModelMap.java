package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		Map<Integer,String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(92, "Quảng Nam");

		
		System.out.println("size: " + vnMotorBikeModel.size());
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		loopByEntry(vnMotorBikeModel);
		// Loop by key, value, entry;
		
	}
	private static void loopByKey(Map<Integer,String> map ) {
		System.out.println("=== Loop by key ===");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.print(key + " ");
		}
		System.out.println();
	}
	private static void loopByValue(Map<Integer,String> map ) {
		System.out.println("=== Loop by value ===");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	private static void loopByEntry(Map<Integer,String> map ) {
		System.out.println("=== Loop by entry ===");
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer,String> entry: entrySet) {
			System.out.print(entry.getKey() + ", " + entry.getValue() + " -- ");
		}
		System.out.println();
	}
	
}
