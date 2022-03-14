package calendar;
import java.util.*;
public class calendar2 {

    public static void main(String[] args)
    {
        // creating Calendar object
        Calendar calendar = Calendar.getInstance();
          
        // Demonstrate Calendar's get()method
        System.out.println("Current Calendar's Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Current Calendar's Day: " + calendar.get(Calendar.DATE));
        System.out.println("Current MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("Current SECOND: " + calendar.get(Calendar.SECOND));
    }
 
		
	
    
    {
    	Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 months later: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 years later: " + calendar.getTime());
    }
    }

