package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import model.DataModel;
import bean.Trader;

public class Ex02MethodReference {
	public static void main(String[] args) {
		List<Trader> traders = model.DataModel.getTraders();
		Set<String> cities = map(traders, trader -> trader.getCity());
		//Set<String> cities = map(traders, Trader::getCity);
		cities.forEach(System.out::println);
		
		
	}
	private static <R> Set<R> map(List<Trader> traders,Function<Trader, R> f){
		Set<R> result = new HashSet<>();
		for (Trader trader: traders) {
			result.add(f.apply(trader));
		}
		return result;
	}
	
}
