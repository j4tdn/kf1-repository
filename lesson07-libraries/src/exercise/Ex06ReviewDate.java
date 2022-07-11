package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Ex06ReviewDate {
	/**
	 * Công ty nhận 1 dự án từ khách hàng + Ngày bắt đầu: 06.07.2022 --> Yêu cầu là
	 * hoàn thành dự án trong 100 ngày Không tính T7 và CN và ngày lễ --> Hỏi ngày
	 * dự án cần bàn giao là ngày nào
	 * 
	 */
	private static final int EXECUTION_DAYS = 100;

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		int dayCount = 1;
		cal.set(2022, Calendar.JULY, 6);
		List<Calendar> holidays = holidays();
		while (dayCount < EXECUTION_DAYS) {
			int weekDay = cal.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekDay == Calendar.SATURDAY || weekDay == Calendar.SUNDAY || isHoliday(holidays, cal));
			if (!isDayOff) {
				dayCount++;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println(df.format(cal.getTime()));
	}

	private static boolean isHoliday(List<Calendar> holidays, Calendar cal) {
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		for (Calendar holiday : holidays) {
			if (holiday.get(Calendar.DAY_OF_MONTH) == dayOfMonth && holiday.get(Calendar.MONTH) == month) {
				return true;
			}
		}
		return false;
	}

	private static List<Calendar> holidays() {
		return Arrays.asList(getInstance(1, Calendar.JANUARY), getInstance(2, Calendar.JANUARY),
				getInstance(3, Calendar.JANUARY), getInstance(4, Calendar.JANUARY), getInstance(5, Calendar.JANUARY),
				getInstance(10, Calendar.MARCH), getInstance(30, Calendar.APRIL), getInstance(1, Calendar.MAY),
				getInstance(2, Calendar.SEPTEMBER), getInstance(28, Calendar.DECEMBER),
				getInstance(29, Calendar.DECEMBER), getInstance(30, Calendar.DECEMBER),
				getInstance(31, Calendar.DECEMBER));

	}

	private static Calendar getInstance(int day, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.set(Calendar.MONTH, month);
		return cal;
	}
}
