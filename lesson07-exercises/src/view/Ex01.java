package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Insert first date  ");

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date start = new Date();
		Date end = new Date();

		try {
			start = df.parse(ip.nextLine());
			long startValue = start.getTime();
			long endValue = end.getTime();

			System.out.println("Break up? (y/n)");

			String breakUp;
			do {
				breakUp = ip.nextLine();
			} while (!breakUp.equals("y") && !breakUp.equals("n"));

			if (breakUp.equals("Y")) {
				while (true) {
					System.out.println("Insert break up day: ");
					end = df.parse(ip.nextLine());
					endValue = end.getTime();
					if (end.after(start)) {
						break;
					}
				}
			}

			String[] dayOfWeeks = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
			String dayOfWeeksAsString = dayOfWeeks[start.getDay()];
			System.out.println("First date :   " + dayOfWeeksAsString);
			System.out.println("They have loved each other for " + yearsDifference(startValue, endValue) + " years.");
			System.out.println("They have loved each other for " + monthsDifference(startValue, endValue) + " months.");
			System.out.println("They have loved each other for " + daysDifference(startValue, endValue) + " days.");
			System.out.println("They have loved each other for " + hoursDifference(startValue, endValue) + " hours.");
			System.out.println("They have loved each other for " + minutesDifference(startValue, endValue) + " minutes.");
			System.out.println("They have loved each other for " + secondsDifference(startValue, endValue) + " seconds.");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	private static long daysDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000);
	}

	private static long monthsDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000) / 30;
	}

	private static long yearsDifference(long startValue, long endValue) {
		return (endValue - startValue) / (24 * 60 * 60 * 1000) / 365;
	}

	private static long hoursDifference(long startValue, long endValue) {
		return (endValue - startValue) / (60 * 60 * 1000);
	}

	private static long minutesDifference(long startValue, long endValue) {
		return (endValue - startValue) / (60 * 1000);
	}

	private static long secondsDifference(long startValue, long endValue) {
		return (endValue - startValue) / 1000;
	}
}
