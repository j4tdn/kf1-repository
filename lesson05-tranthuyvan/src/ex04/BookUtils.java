package ex04;

public class BookUtils {
	public BookUtils() {
	}

	public static void findNhiDongBooks(Book[] books) {
		for (Book book : books) {
			if ("Nhi Đồng".equals(book.getPublisher())) {
				System.out.println(book);
			}
		}
	}

	public static void findBookLessThan50(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book);
			}
		}
	}

	public static void findTextBookWithPricefrom100to200(Book[] books) {
		for (Book book : books) {
			if (book.getPrice() >= 100 && book.getPrice() <= 200) {
				System.out.println(book);
			}
		}
	}

}
