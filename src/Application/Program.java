package Application;

import java.util.Locale;
import java.util.Scanner;

import CurrencyConverter.currencyconverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("What is the dollar price ?  ");
		 currencyconverter.dolar  = sc.nextDouble();
		
		    
		    
		System.out.print("how many dollars will be bought ? " );
		 currencyconverter.qtd = sc.nextDouble();
		    	 
		    	 
		 System.out.println("Amount to be paid in reais = " + currencyconverter.reais());
		
		     
		     
		     
		     
		     sc.close();
		
		
		

	}

}
