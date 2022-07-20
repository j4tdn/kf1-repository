package view;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now().withMonth(8).withYear(2020);
		System.out.println("date: " + date);

		LocalDate anotherDate = LocalDate.of(2022, Month.APRIL, 15);
		System.out.println("another date:" + anotherDate);

		Period period = Period.between(date, anotherDate);
		System.out.println("period" + period);
		System.out.println("toString" +period.getYears() + " years "
									  +period.getMonths() + "months"
									  +period.getDays()+ " days ");
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("  "+df.format(date));

	}
}
