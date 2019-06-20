package exercicio;

import java.util.Scanner;

public class EstruturaCondicionalEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner print  = new Scanner (System.in);
        
       System.out.println("Hora de Entrada: ");
       int h1 = print.nextInt();
       System.out.println("Hora de Saída: ");
       int h2 = print.nextInt();
       int duracao;
       
       if (h1 < h2) {
    	   duracao = h2 - h1;
    	   
       }
       
       else {
    	   
    	   duracao = 24 - h1 + h2;
       }
      
       System.out.println("O JOGO DUROU " + duracao + "HORA(S)");
       
       
       
       
       print.close();
	}

}
