package localTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime2 {

	public static LocalTime of(int hour, int minute) {
		LocalTime lunchTime = LocalTime.of(13, 0);
		return lunchTime;
	}
	

	public static void main(String[] args) {
		LocalDate BD = LocalDate.of(1992, 03, 05);
		LocalDate BD2 = LocalDate.of(1992, Month.MAY, 05);
		System.out.println(BD);
		System.out.println(BD2);
		
		LocalTime lunchTime = LocalTime.of(13, 0);
		LocalTime lunchTime2 = LocalTime.of(13, 5, 0);
		LocalTime lunchTime3 = LocalTime.of(13, 5, 0, 444);		
		System.out.println(lunchTime);
		System.out.println(lunchTime2);
		System.out.println(lunchTime3);
		
		LocalDateTime rightNow = LocalDateTime.of(2018,Month.FEBRUARY,11,11,35,29,111);
		System.out.println(rightNow);
		
		LocalDateTime twoYearsLater = rightNow.plusYears(2);
		LocalDateTime threeweeksLater = rightNow.plusYears(3);
		System.out.println(twoYearsLater);
		System.out.println(threeweeksLater);
		
		LocalDateTime ld = twoYearsLater.plusYears(2).plusDays(2).minusMonths(4);
		System.out.println(ld);
		
		
		
		
		

		

		
		

	}

}




