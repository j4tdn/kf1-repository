package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Warehouse;

public class Ex02ObjectMap {
	public static void main(String[] args) {
		Map<Warehouse, List<Item>> warehouses = inventory();
		warehouses.put(new Warehouse("WH 1", "Vũng Tàu"), 
				Arrays.asList(new Item(1, "A", 10, 101)));
		System.out.println("size: " + warehouses.size());
	}
	
	private static Map<Warehouse, List<Item>> inventory(){
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		
		inventory.put(new Warehouse("WH 1", "Vũng Tàu"), 
				Arrays.asList(new Item(1, "A", 10, 101)));
		
		inventory.put(new Warehouse("WH 2", "Quãng Ngãi"), 
				Arrays.asList(new Item(2, "B", 20, 201)));
		
		inventory.put(new Warehouse("WH 3", "Bình Định"), 
				Arrays.asList(new Item(3, "C", 30, 301)));
		return inventory;
	}
	private static <K, V> void loop(Map<K, V> map) {
		
	}
}
