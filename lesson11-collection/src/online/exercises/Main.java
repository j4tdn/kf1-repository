package online.exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Transaction> transactions = Data.getTransactions();
		print(transactions);
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> ex01 = filter(transactions,t -> t.getYear() == 2011);
		ex01.sort(Comparator.comparing(Transaction::getValue));
		System.out.println("Ex01: ");
		print(ex01);
		
		//2. Find all transactions that have a value greater than 300 and sort them by trader’s city
		List<Transaction> ex02 = filter(transactions,t -> t.getValue() > 300);
		ex02.sort(Comparator.comparing(Transaction::getTraderCity));
		System.out.println("Ex02: ");
		print(ex02);
		
		//3. What are all the unique cities where the traders work?
		
		//4. Find all traders from Cambridge and sort them by name desc.
		List<Transaction> cambridgeTransactions = filter(transactions,t -> t.getTraderCity().equals("Cambridge"));
		Set<Trader> ex04 = new TreeSet<>(Comparator.comparing(Trader::getName));
		for (Transaction transaction: cambridgeTransactions) {
			ex04.add(transaction.getTrader());
		}
		System.out.println("Ex04: ");
		print(ex04);
		
		// 5.Return a string of all traders’ names sorted alphabetically.
		transactions.sort(Comparator.comparing(Transaction::getTraderName));
		Set<String> names = new TreeSet<>();
		for (Transaction transaction : transactions) {
			names.add(transaction.getTraderName());
		}
		System.out.println("Ex05: ");
		print(names);
		
		//6. Are any traders based in Milan? 
		// 7.Count the number of traders in Milan.
		List<Transaction> milanTransaction = 
				filter(transactions, t -> t.getTraderCity().equals("Milan"));
		Set<Trader> ex0607 = new HashSet<>();
		for (Transaction transaction : milanTransaction) {
			ex0607.add(transaction.getTrader());
		}
		System.out.println("Ex06: " + !ex0607.isEmpty());
		System.out.println("Ex07: " + ex0607.size());
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		List<Double> ex08 = new ArrayList<>();
		for(Transaction transaction : ex02) {
			ex08.add(transaction.getValue());
		}
		// 9. What’s the highest value of all the transactions?
		//10. Find the transaction with the smallest value.
		transactions.sort(Comparator.comparing(Transaction::getValue));
		Transaction min = transactions.get(0);
		Transaction max = transactions.get(transactions.size() - 1);
		System.out.println("Ex09: " + min);
		System.out.println("Ex10: " + max);
		
	}
	private static <E> void  print(Collection<E> elements) {
		for (E element : elements) {
			System.out.println(element.toString());
		}
	}
	private static List<Transaction> filter(List<Transaction> transactions, Predicate<Transaction> pr){
		List<Transaction> result = new ArrayList<>();
		for (Transaction transaction: transactions) {
			if (pr.test(transaction)) {
				result.add(transaction);
			}
		}
		return result;
	}
}
