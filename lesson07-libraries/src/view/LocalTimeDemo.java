package view;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now().withHour(10);
		System.out.println("time: " + time);
		
		LocalTime anotherTime = LocalTime.of(22, 20, 2);
		System.out.println("another time: " + anotherTime);
		
		Duration duration = Duration.between(time, anotherTime);
		System.out.println("toString: " + duration.toHoursPart() + " hours "
										+ duration.toMinutesPart()+ " minutes "
										+ duration.toSecondsPart()+ " seconds");
	}
}
