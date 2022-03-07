package SecondExample;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxTiemeOnline {

	public static void main(String[] args) {
		int [] Histo = new  int[24];
		LocalTime [] Horas = new LocalTime[24];

		
		
		Map<Integer, LogFile> visitMap = new HashMap<Integer, LogFile>();
		visitMap.put(1, new LogFile(1, LocalTime.of(13,49,00), LocalTime.of(15,12,00)));
		visitMap.put(2, new LogFile(2, LocalTime.of(12,00,00), LocalTime.of(17,00,00)));
		visitMap.put(3, new LogFile(3, LocalTime.of(15,00,00), LocalTime.of(19,00,00)));
		visitMap.put(4, new LogFile(4, LocalTime.of(14,00,00), LocalTime.of(21,00,00)));
		visitMap.put(5, new LogFile(5, LocalTime.of(10,00,00), LocalTime.of(12,00,00)));
		visitMap.put(6, new LogFile(6, LocalTime.of(9,00,00), LocalTime.of(16,00,00)));
		visitMap.put(7, new LogFile(7, LocalTime.of(15,22,00), LocalTime.of(15,40,00)));
		
		
		//System.out.println(visitMap.size());

	for(int i=1;i<visitMap.size()+1;i++) {
		int b=(int) ChronoUnit.HOURS.between(LocalTime.of(00,00,00),visitMap.get(i).getStartTime());//+
		int c=(int) ChronoUnit.HOURS.between(LocalTime.of(00,00,00),visitMap.get(i).getEndTime());
		
	for(int j=b;j<=c;j++){ 
			  Histo[j]+=1;
			  
	}
	}
	
	int index_Max=0;
	int max = Arrays.stream(Histo).max().getAsInt();
	for(int j=0;j<=Histo.length-1;j++){ 
		Horas[j]=LocalTime.of(00,00,00).plusHours(j);
	    System.out.println("from "+ Horas[j]+ " to "+ Horas[j].plusHours(1));
		System.out.println("are "+ Histo[j]+ " users in server");
		
		if(Histo[j]==max) {
			index_Max=j;
		}
	  }
    
    System.out.println("The most concurrenhours is form " + Horas[index_Max]+ " to "+ Horas[index_Max+1]);
    System.out.println("where the most numeber of users is "+ max);
	}
	}


