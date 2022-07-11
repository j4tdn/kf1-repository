package homework;

import java.util.Calendar;

import exercise.DateUtils;


public class Ex02WeekDayCalculator {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String month = DateUtils.getMonthAsString(calendar);
		int year =  calendar.get(Calendar.YEAR);
		String weekDay = DateUtils.getWeekDayAsString(calendar);
		System.out.println(day + " " + month + " " + year + " is a " + weekDay);
		
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int dayOfWeekInMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int dayInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Additional fact:");
		System.out.println("It is day " + dayOfYear + " of the year, " + (dayInYear-dayOfYear) + " days left");
		System.out.println("It is " + weekDay + " number " + weekOfYear + " out of 52 in " + year);
		System.out.println("It is " + weekDay + " number " + dayOfWeekInMonth + " in " + month + " " + year);
		System.out.println("Year " + year + " has " + dayInYear + " days");
		System.out.println(month + " " + year + " has " + dayInMonth + " days");
	
	}
	
}
