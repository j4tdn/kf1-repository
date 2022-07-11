package exercise;

import java.util.Calendar;

public class Ex03DaysInWeek {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(DateUtils.getWeekDayAsString(cal));

	}
}
