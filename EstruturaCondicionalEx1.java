package exercicio;

import java.util.Scanner;

public class EstruturaCondicionalEx1 {
    
	   private static Scanner print;

	public static void main (String[]args) {
		  print = new Scanner(System.in); 
	   
		System.out.println("Digite um Valor");
		int n1 = print.nextInt();
		 
		if (n1 < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Positivo");
		}
	   }	
	
}
