package exercicio;

import java.util.Scanner;

public class ExercicioEntradaDados {
	public static void main(String[]args) {
		
	Scanner sc = new Scanner (System.in);
	
	int v1 = sc.nextInt();
	int v2 = sc.nextInt();
	int soma = v1 + v2;
	int v3 = sc.nextInt();
	int v4 = sc.nextInt();
	int soma2 = v3 + v4;
	
	
	System.out.println("Primeiro valor: " + v1);
	System.out.println("Segundo valor: " + v2);
	System.out.println("Somatório total: " + soma);
	System.out.println("Terceiro valor: " + v3);
	System.out.println("Quarto Valor: " + v4);	
	System.out.println("Segundo Somatório: " + soma2);
	
	
	sc.close();
	
	}
	
}
