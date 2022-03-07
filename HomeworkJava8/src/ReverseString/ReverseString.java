package ReverseString;

public class ReverseString {

	    public static void main(String[] args) {
	        String cadena = "Hello! This is a text to reverse";
	        String reversedCadena = cadena.chars().
	        		mapToObj(chain -> (char)chain).reduce("", (s,chain) -> chain+s, (s1,s2) -> s2+s1);
	        System.out.println(reversedCadena);
	    
	}
}

