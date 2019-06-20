package exercicio;

import java.util.Locale;
import java.util.Scanner;


public class SaidaDados2 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String f1 = "Enter your Name";
	    String name1 = sc.nextLine();
	    String f2 = "How many bedrooms are there in your house?";
	    int i = sc.nextInt();
	    String f3 = "Enter product price:";
	    double d1 = sc.nextDouble();
	    String f4 = "Enter your last name, age, and height (same line):";
	    String name2 = sc.next();
	    int i2 = sc.nextInt();
	    double d2 = sc.nextDouble();
	    
	    System.out.println(f1);
	    System.out.println(name1);
	    System.out.println(f2);
	    System.out.println(i);
	    System.out.println(f3);
	    System.out.println(d1);
	    System.out.println(f4);
	    System.out.println(name2);
	    System.out.println(i2);
	    System.out.println(d2);
	 
	    
	    sc.close();
	    		
	    
		
		
		
	}
	
	

}
