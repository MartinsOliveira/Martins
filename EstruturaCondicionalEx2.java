package exercicio;

//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.

import java.util.Scanner;

public class EstruturaCondicionalEx2 {
	

	public static void main(String[]args) {
		 
		Scanner dg = new Scanner(System.in);
		 
	  System.out.println("Digite um valor:  ");
	  int i = dg.nextInt();
	  
	  if (i % 2 == 0) {
		  System.out.println("Par");
		  
	  }
	  else {
		  System.out.println("Impar");
	  }
	  
	  dg.close();
	 }
        
}
