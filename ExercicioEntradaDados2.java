package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
       double  p = 3.1459; //valor de Pi;
       double  v1 = sc.nextDouble();
      double   result1 = (v1* v1) * p;
      
		
		System.out.printf(" A= %.4f%n", result1);
		
		sc.close();	
		
	}

}
