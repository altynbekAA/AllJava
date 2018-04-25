package letsdoit;

import java.util.*;

public class ScheduleForCybertek {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("kakoi segodnya den nedeli? ");
	    String weeks = scan.nextLine();
	    
	    switch (weeks) { 
	    	case  "Monday":
	    	case  "monday":
	    		System.out.println("Group study  7pm to 10pm");
	    		break;
	    	case "Tuesday":
	    	case "tuesday":
	    		System.out.println("Esens class 7pm to 10pm");
	    		break;
	    	case "Wednesday":
	    	case "wednesday":
	    		System.out.println("OCA exam 7pm to 10pm");
	    		break;
	    	case "Thursday": 
	    	case "thursday":
	    		System.out.println("Kuzzats class 6pm to 9pm");
	    		break;
	    	case "Friday":
	    	case "friday":
	    		System.out.println("Off no class");
	    		break;
	    	case "Saturday":
	    	case "saturday":
	    		System.out.println("Murodils class 10am to 4pm");
	    		break;
	    	case "Sunday":
	    	case "sunday":
	    		System.out.println("Murodils class 10am to 4pm");
	    		break;
	    		default:
	    			System.out.println("Error try again");
	    	}
		
		
		
}
}
			   
		   
	
	
	
	
	
	
	
