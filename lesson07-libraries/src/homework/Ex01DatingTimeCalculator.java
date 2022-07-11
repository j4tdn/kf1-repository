package homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex01DatingTimeCalculator {
	public static void main(String[] args) {
		LocalDateTime startDateTimeTime = LocalDateTime.of(2010, 10, 20, 7, 0);
		LocalDateTime endDateTime =	LocalDateTime.of(2010, 11, 20, 7, 0);
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(startDateTimeTime.getDayOfWeek());
		boolean isBrokenUp = false;
		if (isBrokenUp) {
			System.out.println(dateBetween(startDateTimeTime,endDateTime));
		}else {
			System.out.println(dateBetween(startDateTimeTime,currentDateTime));
		}
		
		
	}
	private static String dateBetween(LocalDateTime startDateTime,LocalDateTime endDateTime) {
		if (endDateTime.isBefore(startDateTime)) {
			throw new IllegalArgumentException(" startDateTime cannot exceed endDateTime");
		}
		String datingTime= "";
		LocalDate dStart = startDateTime.toLocalDate();
		LocalTime tStart = startDateTime.toLocalTime();
		LocalDate dEnd = endDateTime.toLocalDate();
		LocalTime tEnd = endDateTime.toLocalTime();
		Period period = Period.between(dStart, dEnd);
		Duration duration = Duration.between(tStart, tEnd);
		
		
		if (duration.isNegative()) {
			duration.plusDays(1);
			period.minusDays(1);
		}
		if (period.getYears() > 0 ) {
			datingTime += period.getYears() + " years ";
		}
		if (period.getMonths() > 0) {
			datingTime += period.getMonths() + " months ";
		}
		if (period.getDays() > 0 ) {
			datingTime += period.getDays() + " days ";
		}
		if (duration.toHoursPart() > 0 ) {
			datingTime += duration.toHoursPart() + " hours ";
		}
		if (duration.toMinutesPart() > 0 ) {
			datingTime += duration.toMinutesPart() + " minutes ";
		}
		if (duration.toSecondsPart() > 0 ) {
			datingTime += duration.toSecondsPart() + " seconds ";
		}
		
		return datingTime;
	}
	}

