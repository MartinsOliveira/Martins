package exercicio;

import java.util.Scanner;

public class EstruturaCondicionalEx3 {
       public static void main (String[]args) {
       
       Scanner print = new Scanner(System.in);
       
       System.out.println("Digite o primeiro valor: ");
       int n1 = print.nextInt();
       System.out.println("Digite o pegundo valor:  ");

       int n2 = print.nextInt();
       
       if(n1 % n2 == 0 || n2 % n1 == 0) {
    	   
    	   System.out.println("São Multiplos");
    	   
       }
       
       else {
    	   System.out.println("Não são Multiplos");
       }
       
       
       print.close();
   }
}