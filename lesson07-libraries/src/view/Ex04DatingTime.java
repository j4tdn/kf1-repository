package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DatingTime {
	public static void main(String[] args) {
		LocalDateTime dtStart = LocalDateTime.of(2020, 4, 20, 10, 20, 30);
		LocalDateTime dtEnd = LocalDateTime.now();
		
		String duration = between(dtStart,dtEnd);
		System.out.println("duration: " + duration);
	}
	private static 	String between (LocalDateTime dtStart, LocalDateTime dtEnd) {
		if (dtEnd.isBefore(dtStart)) {
			throw new IllegalArgumentException(" StartDate cannot exceed EndDate");
		}
		String datingTime= "";
		LocalDate dStart = dtStart.toLocalDate();
		LocalTime tStart = dtStart.toLocalTime();
		LocalDate dEnd = dtEnd.toLocalDate();
		LocalTime tEnd = dtEnd.toLocalTime();
		Period period = Period.between(dStart, dEnd);
		Duration duration = Duration.between(tStart, tEnd);
		
		if (duration.isNegative()) {
			duration.plusDays(1);
			period.minusDays(1);
		}
		
	
		return "";
	}
}
