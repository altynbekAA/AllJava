package localTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PeriodClass {
	public static void main(String[] args) {
		
		
		
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter standardFormat = DateTimeFormatter.ISO_LOCAL_DATE;				
		DateTimeFormatter f1 = DateTimeFormatter.ISO_ORDINAL_DATE;
		//DateTimeFormatter f2 = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_WEEK_DATE;

		System.out.println(standardFormat.format(now));
		System.out.println(f1.format(now));
		System.out.println(f3.format(now));
		
		
		
		
		
		
		
	}

}




