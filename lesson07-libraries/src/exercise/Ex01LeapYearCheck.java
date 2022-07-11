package exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex01LeapYearCheck {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		int currentYear = cal.get(Calendar.YEAR);

		if (isLeapYear(currentYear)) {
			System.out.println(currentYear + " is leap year");
		} else {
			System.out.println(currentYear + " is not leap year");
		}
		GregorianCalendar c = new GregorianCalendar();

		System.out.println(c.isLeapYear(2012));

	}

	private static boolean isLeapYear(int year) {
		if (year % 4 != 0)
			return false;
		return year % 100 == 0 && year % 400 == 0;

	}
}
