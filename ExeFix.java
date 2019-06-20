/**
 * Para inclusão do cifrão, basta inserir normalmente sem a necessidade de informar através de um Locale da biblioteca
 */
/**
 * @author ivanio.oliveira
 *
 */
package exercicio;

import java.util.Locale;

public class ExeFix {
	
	public static void main (String[]args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
	    System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s wich price is $ %.2f%n ", product2, price2);
		System.out.printf("Record: %s years old, code %s and gender: %s%n", age, code, gender);
		System.out.printf("Measue with eight decimal place: %.8f%n Rouded (three decimal places: %.3f%n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure );
	}
	
	
};