package FirstExample;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Concatenate {
	public static void main(String[] args) {
		
		List<String> Planets = Arrays.asList("Mercury", "Venus", "Mars");
		String PlanetsCommaSeparated = Planets.stream().collect(Collectors.joining(", "));
		System.out.println("Planets: "+ PlanetsCommaSeparated);
		
		
		
	}
}
