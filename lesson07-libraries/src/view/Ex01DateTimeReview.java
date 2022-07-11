package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01DateTimeReview {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date:" + date);

		System.out.println("==============");

		Calendar cal = Calendar.getInstance();
		System.out.println("cal" + cal);

		int year = cal.get(Calendar.YEAR);

		System.out.println("current year:" + year);

		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("current day:" + dayOfMonth);

		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("current month:" + month);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString = "02/07/2022";
		try {
			Date parsedDate = df.parse(dateAsString);
			System.out.println("parsedDate:" + parsedDate);

			Calendar parsedCal = Calendar.getInstance();
			parsedCal.setTime(parsedDate);

			System.out.println("parsedCal: " + parsedCal);

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
