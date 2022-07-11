package exercise;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int daysInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Current year has " + daysInYear + " days");

		int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Current month has " + daysInMonth + "days");
	}
}
