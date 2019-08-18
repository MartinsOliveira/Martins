package operacaocaixa;

import java.util.Locale;
import java.util.Scanner;

import saldoconta.SaldoConta;



public class OperaçãoCaixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner print = new Scanner(System.in);
		SaldoConta saldoconta;

		System.out.print("Entre com o nome do Cliente: ");
		String nome = print.nextLine();
		System.out.print("Entre com o número da conta:  ");
		print.nextLine();
		String conta = print.nextLine();
		System.out.print("É o seu deposito inicial? Y/N: ");
		char resposta = print.next().charAt(0);
		
		
		
		if(resposta == 'y' ) {
			
			System.out.println("Entre com o valor do depósito inicial: ");
			double depositoinicial = print.nextDouble();
		      saldoconta = new SaldoConta(nome, conta, depositoinicial);
		}
		else {
			
			 saldoconta = new SaldoConta(nome, conta);
			
		}
		
		System.out.println();
		System.out.println("Títular da Conta:");
		System.out.println(saldoconta);
		
		System.out.println();
		System.out.println("Entre com o valor do depósito: ");
		double valordeposito = print.nextDouble();
		saldoconta.Deposito(valordeposito);
		System.out.println("Alterado do valor do saldo: ");
		System.out.println(saldoconta);
		
		System.out.println();
		System.out.println("Entre com o valor do saque: ");
		double valorsaque = print.nextDouble();
		saldoconta.Saque(valorsaque);
		System.out.println("Alterado do valor do saldo: ");
		System.out.println(saldoconta);
		
		
		print.close();
	}

}
