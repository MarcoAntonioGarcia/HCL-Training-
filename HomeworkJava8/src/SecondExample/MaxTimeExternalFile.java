package SecondExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxTimeExternalFile {

	public static void main(String[] args) {
		
		HashMap<Integer, LogFile> ReadMap = new HashMap<Integer,LogFile>();
	       
        Path path = Paths.get("/Users/marco/Desktop/LogFileText.txt"); 
        String[] read;
		try {
			read = Files.readAllLines(path).toString().replace(",", "").replace("[", "").replace("]", "").split(" ");
			System.out.println(read[0]);
			 for(int i=0;i<read.length;i++) {
			     String[] arr = read[i].replace("VisitID=", "").replace("StartTime=", "").replace("EndTime=", "").replace("-", " ").replace(";", ",").split(" ");		
				 ReadMap.put(i+1, new LogFile(Integer.parseInt(arr[0]), LocalTime.parse(arr[1]), LocalTime.parse(arr[2])));

			        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
  
	int [] Histo = new  int[24];
	LocalTime [] Horas = new LocalTime[24];

	

	for(int i=1;i<ReadMap.size()+1;i++) {
		int b=(int) ChronoUnit.HOURS.between(LocalTime.of(00,00,00),ReadMap.get(i).getStartTime());//+
		int c=(int) ChronoUnit.HOURS.between(LocalTime.of(00,00,00),ReadMap.get(i).getEndTime());
		
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
	System.out.println(Horas[20]+"khbkjh");
    
    System.out.println("The most concurrenhours is form " + Horas[index_Max]+ " to "+ Horas[index_Max+1]);
    System.out.println("where the most numeber of users is "+ max);
    
   
	String fileName = "/Users/marco/Desktop/LogFileTextSalida.txt";
    try{
    List<String> lines = Arrays.asList("The most concurrenhours is form " + Horas[index_Max]+ " to "+ Horas[index_Max+1],
    		"where the most numeber of users is "+ max);
    Path file = Paths.get(fileName);
    Files.write(file, lines, StandardCharsets.UTF_8);
    }
    catch (IOException e){
      System.out.println("An error occurred.");
      e.printStackTrace();
    }	
  

	}
}
