package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		Calendar cal = Calendar.getInstance();

		do {
			try {
				System.out.println("Enter the date(dd/MM/yyyy): ");
				date = df.parse(new Scanner(System.in).nextLine());
				break;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} while (true);

		cal.setTime(date);

		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		int dayLeftOfYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - cal.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		int weekYear = cal.getWeeksInWeekYear();
		int weekOfMonth = Math.round(cal.get(Calendar.DAY_OF_MONTH) * 1.0f / 7);
		int weekMonth = 4;
		int dayYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		DayOfWeek[] dayEnum = DayOfWeek.values();
		Month[] monthEnum = Month.values();

		System.out.println("It is day number " + dayOfYear + " of the year, " + dayLeftOfYear + " days left");
		System.out.println(
				"It is " + dayEnum[dayOfWeek - 1] + " number " + weekOfYear + " out of " + weekYear + " in " + year);
		System.out.println("It is " + dayEnum[dayOfWeek - 1] + " number " + weekOfMonth + " in month "
				+ monthEnum[month] + " " + year);
		System.out.println("Year " + year + " has " + dayYear + " days");
		System.out.println(monthEnum[month] + " " + year + " has " + dayMonth + " days");
	}

}
