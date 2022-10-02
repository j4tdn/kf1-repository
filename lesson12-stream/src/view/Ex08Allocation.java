package view;

import java.math.BigDecimal;
import static java.util.Comparator.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		List<Store> stores = DataModel.getStores();
		// 1. Get all stores which have stock previous day greater than 15
		System.out.println("Exercise 1: ");
	    stores.stream()
			  .filter(st -> st.getStockPreviousDay().compareTo(bd(15)) > 0)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
	    System.out.println("Exercise 2: ");
		stores.stream()
			  .filter(st -> st.getNonNullStockPreviousDay().compareTo(st.getNonNullExpectedSales()) > 0)
			  .sorted((comparing(Store::getStoreId, reverseOrder())))
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
			  
		// 3. Get stores have no reference store and return list of store ids
		System.out.println("Exercise 3: ");
		stores.stream()
			  .filter(st -> st.getReferenceStoreId() == null)
			  .map(Store::getStoreId)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
		// 4. Distinct stores by stock previous day
		System.out.println("Exercise 4: ");
		stores.stream()
			  .filter(distinctBy(Store::getStockPreviousDay))
			  .forEach(System.out::println);;
		// 5. Get first 2 stores with max expected sales 
		System.out.println("Exercise 5:");
		stores.stream()
			  .sorted(comparing(Store::getExpectedSales, nullsLast(reverseOrder())))
			  .limit(2)
			  .forEach(System.out::println);;
		// 6. Get list of reference stores
		System.out.println("Exercise 6: ");
		stores.stream()
			  .map(Store::getReferenceStoreId)
			  .filter(Objects::nonNull)
			  .collect(Collectors.toList())
			  .forEach(System.out::println);
		// 7. Is there any store has no expected sales
		stores.stream()
			  .filter(st -> st.getNonNullExpectedSales().equals(BigDecimal.ZERO))
			  .collect(Collectors.toList());
		
		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		
		// 9. Calculate sum of expected sales today
		stores.stream()
			  ;
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
		Optional<Store> opt = stores.stream()
			  .sorted(comparing(Store::getNonNullStockPreviousDay,reverseOrder())
					 .thenComparing(Store::getStoreId))
			  .findFirst();
		if (opt.isPresent())
			System.out.println(opt.get());
			  
			  
	}
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> set = new HashSet<>();
		return t -> set.add(function.apply(t));
	}
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }
}