package homework;

import java.util.Calendar;

public class Ex03 {

	private static Calendar lastDayOfMonth(Calendar cal) {
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, lastDayOfMonth);
		return cal;
	}

}
