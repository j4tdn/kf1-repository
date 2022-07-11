package exercise;

import java.util.Calendar;

public class Ex05SundayCounter {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int counter = 0;
		for (int dateIndex = 1; dateIndex <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); dateIndex++) {
			cal.set(Calendar.DAY_OF_MONTH, dateIndex);
			if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
				counter++;
			}

		}
		System.out.println(counter + " Sunday");
	}
}
