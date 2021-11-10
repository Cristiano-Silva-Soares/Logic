package udemyEX;

import java.util.Locale;

public class ex1 {
	
	

	public static void main(String[] args) {
		
	
		
	String product1 = "computer";
	String product2 = "oficce desk";
	
	int age = 30;
	int code  = 5290;
	char gender  = 'F';
	
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("\nProducts: ");
	System.out.println(product1 + " which price is $ " +  price1 );
	System.out.println(product2 + " which price is $ " + price2);
	
	System.out.println("\nRecord: " + age + "years old, code " + code + " and gender: " + gender);
	
	System.out.printf("\nMeasue with eight decimal places: %.8f%n " , measure);
	System.out.printf("Rounded with three decimal places: %.3f%n " , measure);
	Locale.setDefault(Locale.US);
	System.out.printf("Us decimal point: $%.3f%n" , measure);
		
	}

}
