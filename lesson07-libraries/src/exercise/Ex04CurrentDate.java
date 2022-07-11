package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04CurrentDate {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY EEEE");

		for (int dateIndex = 1; dateIndex <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); dateIndex++) {
			cal.set(Calendar.DAY_OF_MONTH, dateIndex);
			System.out.println(df.format(cal.getTime()));
		}

	}
}
