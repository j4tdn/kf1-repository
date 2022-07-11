package view;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex02LocalDateDemo {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now()
				.withMonth(8)
				.withYear(2020);
		System.out.println("date: " + date);
		
		LocalDate anotherDate = LocalDate.of(2022, Month.APRIL, 15);
		System.out.println("another day: " + anotherDate);
		
		//between ==> Period, Duration
		Period period = Period.between(date, anotherDate);
		System.out.println("period: " + period);
		System.out.println("toString: " +period.getYears() + " years "
										+period.getMonths() + " months "
										+period.getDays() + " days");
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted: " + df.format(date));
		
		LocalDate parsed = LocalDate.parse("20.08.2022",DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println("parsed: " + parsed);
	}
}
