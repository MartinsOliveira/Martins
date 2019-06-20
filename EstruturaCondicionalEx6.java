package exercicio;

import java.util.Scanner;

public class EstruturaCondicionalEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner print = new Scanner(System.in);
		System.out.println("Digite um número: ");
		float val = print.nextFloat();
       
		
		if (val > 0 && val <= 25) {
			
			System.out.println("Intervalo (0,25]" );	
		}
		
		else if (val > 25 && val <= 50)
		    
			System.out.println("Intervalo (25,50]" );
		
       print.close();
	}

}
