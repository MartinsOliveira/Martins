package exercicio;


import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepeticaoEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		
		Scanner print = new Scanner(System.in);
        
		System.out.println("Digite o Código do Produto");
		int prod = print.nextInt();
		
		System.out.println("Digite a Quantidade ");
		int qtd = print.nextInt();
		double  val = 0 ;
		
		if (prod == 1 ) {
			val = qtd * 4.0;
			
			
		 }		
		else if (prod == 2 ) {
			
			val = qtd * 4.50;

			
		   }
         else if (prod == 3 ) {
			
			val = qtd * 5.00;
		   }
   
         else if (prod == 4 ) {
 			
 			val = qtd * 2.00;

         }
         else if (prod == 5 ) {
 			
 			val = qtd * 1.50;
          
         }
		
		  System.out.printf("O valor do Lanche é: R$ %.2f%n", val);
		print.close();
	}
       
  }

