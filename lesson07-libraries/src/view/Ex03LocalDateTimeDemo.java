package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("datetime: " + datetime);
		
		LocalDateTime anotherDatetime = LocalDateTime.of(2020, 8, 14, 10, 10);
		System.out.println("another datetime:" + anotherDatetime);
		
		LocalDate ldate = anotherDatetime.toLocalDate();
		LocalTime ltime = anotherDatetime.toLocalTime();
		System.out.println("ldate: " + ldate);
		System.out.println("ltime: " + ltime);
		
	}
}
