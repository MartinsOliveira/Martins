package estoque;
import java.util.Locale;
import java.util.Scanner;

import app_estoque.Product;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner print = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		
		String name = print.nextLine();
		
		System.out.print("Price: ");
		double price = print.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = print.nextInt();
		

		Product product = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Updated name: "  + product.getName());
		
		product.setPrice(2000);
		System.out.println("Updated price: "  + product.getPrice());
		
		System.out.println("Quantity: " + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		 quantity = print.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = print.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
	
		
		print.close();
		}

	}


