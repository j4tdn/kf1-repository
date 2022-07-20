package homework;

import java.util.Calendar;

public class DateUtils {
	private static String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	private DateUtils() {
	}

	public static String getWeekDayAsString(Calendar cal) {
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);
		return days[weekDay - 1];
	}

	public static String getMonthAsString(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		return months[month];
	}
}
