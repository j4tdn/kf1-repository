package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03SortedMap {
	public static void main(String[] args) {
		Map<Integer, String> elements = findAllUnSortedMap();
		
		print(elements);
		
	}
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		// transfer map to list
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		
		// sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> elements) {
		for (Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}
	private static Map<Integer, String> findAllUnSortedMap() {
		// Hashmap : unordered, unsorted.
		// Treemap : sorted by keys -> key implements Comparable<K>
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(74, "Quảng Trị");
		return vnMotorBikeModel;
	}
	private static Map<Integer, String> findAll() {
		// Hashmap : unordered, unsorted.
		// Treemap : sorted by keys -> key implements Comparable<K>
		// LinkedHashMap : ordered
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>((k1, k2) -> (k2 - k1));
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(74, "Quảng Trị");
		return vnMotorBikeModel;
	}

}
