package palindromoProblem;

import java.util.stream.IntStream;

public class PalindromoMain {
		
		public static void main(String[] args) {
	        String cadena = "Anita laba la tina";
	        String cadena2 = cadena.toLowerCase().replace(" ", "");
	        boolean razon = IntStream.range(0, cadena2.length() / 2)
	                .noneMatch(index -> cadena2.charAt(index) != cadena2.charAt(cadena2.length() - index - 1));
	        System.out.println("the chain is palindrome? "+ razon);
	        
	    }
	 
	}

		
		
		
		
		
		/*
		String cadena= "ejamplo ";
		cadena = cadena.toLowerCase().replace(" ", "");
		String aaa = new StringBuilder(cadena.substring(0,cadena.length()/2)).reverse().toString();
		System.out.println(aaa);
		//cadena = cadena.toLowerCase().replace(" ", "");
		//System.out.println(cadena.length());
		//System.out.println(cadena.length()/2);
		//String cadena1mitad=cadena.substring(0, cadena.length()/2);
		//String cadena2mitad=cadena.substring(cadena.length()/2,cadena.length());
		//System.out.println(cadena +cadena1mitad+cadena2mitad);
		//esPalindromo(cadena);
	}
	
	public static void esPalindromo(String cadena) {
		cadena = cadena.toLowerCase().replace(" ", "");
		System.out.println(cadena.length()%2);
		boolean razon;
		if (cadena.length()/2==0 && cadena.substring(0,cadena.length()/2).equals(new StringBuilder(cadena.substring(cadena.length()/2,cadena.length())).reverse().toString())) {
			razon=true;
		}
		else {razon=false;}
		if (cadena.length()/2==1 && cadena.substring(0,cadena.length()/2).equals(new StringBuilder(cadena.substring(cadena.length()/2+1,cadena.length())).reverse().toString())) {
		   razon=true;
		}
		else {razon=false;}
		System.out.println(razon);
	}
	}
*/

