package view;

import static java.util.Comparator.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex05StreamPreDemo {
	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		System.out.println("1. Get dishes which have calories > 250g");
		List<Dish> weightCalories = menu.stream()//Stream<Dish>
			.filter(d -> d.getCalories() > 400)//Stream<Dish>
			.collect(Collectors.toList());
		weightCalories.forEach(System.out::println);
		System.out.println("2. Get names of dishes");
		Set<String> namesOfDishes = menu.stream()
			.map(Dish::getName)
			.collect(Collectors.toSet());
		namesOfDishes.forEach(System.out::println);
		
		String names = menu.stream()
					.map(Dish::getName)
					.collect(Collectors.joining(","));
		System.out.println(names);
		System.out.println("3. Get name of dishes which is vegatarian food");
		Set<String> vegatarianDishes = menu.stream()
			.filter(Dish::isVegetarian)
			.map(Dish::getName)
			.collect(Collectors.toSet());
		vegatarianDishes.forEach(System.out::println);
		System.out.println("4. Sort a vehicle model map");
		Map<Integer, String> modelMap = DataModel.getVehicleModelMap();
		modelMap.entrySet()
			.stream()
			.sorted(comparing(Entry::getValue))
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			
			
			
		
	}
}
