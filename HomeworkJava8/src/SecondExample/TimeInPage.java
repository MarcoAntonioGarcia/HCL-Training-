package SecondExample;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 

public class TimeInPage {
	
	 public static void main(String[] args) {
	        LocalDate currentDate = LocalDate.now();
	        //.out.println(currentDate);
	        LocalDate dob = LocalDate.of(2000, 3, 2);
	        System.out.println("Compare: " +(ChronoUnit.YEARS.between(currentDate, dob)));
	        //System.out.println("hora "+ LocalTime.of(12,00,00));
	       /* 
	        LocalTime startTime = LocalTime.now(ZoneId.systemDefault());
	        
	        //LocalTime ss = LocalTime.now();
	        
	        LocalTime.now(Clock.systemUTC()); //Hora con que cordina los horarios en el MW
	        //System.out.println(LocalTime.now(Clock.systemUTC()));
	        //System.out.println(startTime);
	        //LocalDate parsedDate = LocalDate.parse(currentDate.toString(), DateTimeFormatter.ISO_DATE);
	        //System.out.println(parsedDate);
	        //parsedDate.format(DateTimeFormatter.ISO_DATE);
	        
	        LocalTime endTime = LocalTime.MIDNIGHT.minusHours(7);
	        System.out.println(endTime);
	        
	        System.out.println(ChronoUnit.HOURS.between(startTime, endTime));
	        
	        timeStream(startTime, endTime);
	        timeStreamFor(startTime, endTime);
	    }
	 
	    
	    
	    static void timeStream(LocalTime startTime, LocalTime endTime) {
	     List<Integer> hourList = Stream.iterate(startTime, h->h.plusHours(1))
	    	   .limit(ChronoUnit.HOURS.between(startTime, endTime)+1)
	    	   .map(LocalTime::getHour).collect(Collectors.toList()); //Entender
	     
	     
	     hourList.stream().forEach(t->System.out.println(t));
	     //.forEach(sec->System.out.println(sec));
	     
	     
	     //IntStream.range(1001, 1006).forEach(System.out::println);
	     
	    }
	 
	    static void timeStreamFor(LocalTime startTime, LocalTime endTime) {
	     for(LocalTime start1 = startTime;start1.isBefore(endTime); start1=start1.plusMinutes(1))
	     { 
	         System.out.println(start1); 
	     }
	     */
	    }
	    
	
}
