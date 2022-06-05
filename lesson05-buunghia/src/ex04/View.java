package ex04;

import java.util.ArrayList;
import java.util.List;


public class View {
	private List<Book> findBookByPubLisher(List<Book> list, String publisher){
		List<Book> bookList = new ArrayList<>();
		for (Book book: list) {
			if (book.getPublisher() == publisher)
				bookList.add(book);
		}
		return bookList;
	}
	private List<Book> findBookByPrice(int min , int max, List<Book> list){
		List<Book> bookList = new ArrayList<>();
		for (Book book: list) {
			if (book.getPrice() >= min && book.getPrice()>= max)
				bookList.add(book);
		}
		return bookList;
	}
	private double totalPrice(Client client) {
		List<Book> bookList = client.getBookList();
		double price = 0;
		for (Book book: bookList) {
			if (book instanceof TxtBook) {
			TxtBook txtBook = (TxtBook) book;
			if (txtBook.isOld) 
				price += txtBook.getPrice()*0.7;
			else
				price += txtBook.getPrice();
			}
			if (book instanceof RefBook) {
				RefBook refBook = (RefBook) book;
				price += refBook.getPrice()*(1+refBook.getTax());
			}
		}
		return price;
	}
}
