package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		String f1 = "Enter your full name:";
        String n1 = sc.nextLine();
        String f2 = "How many bedrooms are there in your house?";
           int n2 = sc.nextInt();
        String f3 = "Enter product price: ";
           double n3 = sc.nextDouble();
           String f4 = "Enter your last name, age and height (same line): ";
           String n4 = sc.next();
              int i1 = sc.nextInt();
           double n5 = sc.nextDouble();
           
        
        
        
	
		
		
		
		System.out.println(f1);
		System.out.println(n1);
		System.out.println(f2);
		System.out.println(n2);
		System.out.println(f3);
		System.out.println(n3);
		System.out.println(f4);
		System.out.println(n4);
		System.out.println(i1);
		System.out.println(n5);
		
	
	sc.close();
	
	}

}
