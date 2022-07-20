package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DatingTime {
	public static void main(String[] args) {
		LocalDateTime dtStart = LocalDateTime.of(2022, 6, 4, 23, 58, 30);
		LocalDateTime dtEnd = LocalDateTime.now();
		
		String duration = between(dtStart, dtEnd);
		System.out.println("Duration " + duration);
	}
	
	private static String between (LocalDateTime dtStart, LocalDateTime dtEnd) {
		if(dtStart.isAfter(dtEnd)) {
			throw new IllegalArgumentException("StartDate cannot exceed EndDate");
		}
		
		LocalDate startDate = dtStart.toLocalDate();
		LocalDate endDate = dtEnd.toLocalDate();
		LocalTime startTime = dtStart.toLocalTime();
		LocalTime endTime = dtEnd.toLocalTime();
		
		Duration duration = Duration.between(startTime, endTime);
		Period period = Period.between(startDate, endDate);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		
		
		return period.toString() + " ------ " + duration.toString();
	}
}
