package view;

import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Ex06 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.JULY, 6);
		
		Calendar c = Calendar.getInstance();
		
		int deadline = 1;
	}
	
	private static List<Calendar> holidays(){
		return Arrays.asList(
				getInstance(1, 1),getInstance(2, 1),getInstance(3, 1),
				getInstance(4, 1),getInstance(5, 1),getInstance(10, 3),
				getInstance(30, 4),getInstance(1, 5),getInstance(2, 9),
				getInstance(28, 12),getInstance(29, 12),getInstance(31, 12)
				);
	}
	
	private static boolean isHoliday(List<Calendar> holidays,Calendar cal) {
		int dayofMonth = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
	}
	
	private static Calendar getInstance(int day, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, month);
		cal.set(Calendar.MONTH, month);
		return cal;
	}
}
