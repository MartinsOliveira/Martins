package calculohoraextra;

import java.util.Locale;
import java.util.Scanner;

import horaextra.CaculoHoraExtra;

public class HoraExtraCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner print = new Scanner(System.in);

		CaculoHoraExtra calculoextra;

		calculoextra = new CaculoHoraExtra();

		System.out.println("Insira o seu salário:  ");
		calculoextra.salario = print.nextDouble();

		System.out.println("Insira quantidade de horas realizadas");
		calculoextra.quantidade_horas = print.nextDouble();

		System.out.println("Insira o quantidade de horas plantão");
		calculoextra.hora_aviso = print.nextDouble();
	
		System.out.println();

		System.out.printf("Seu saldo de hora-extra a receber é de: R$ %.2f", calculoextra.HoraExtra());

		System.out.println();

		System.out.println("O saldo do plantão:  " + calculoextra.HoraPlantao());

		System.out.println();
		
		System.out.printf("O Salário Bruto é:   R$ %.2f", calculoextra.SalarioBruto());
		
		System.out.println();

		System.out.printf("Salário Bruto menos desconto de Inss: R$ %.2f", calculoextra.DescontoInss());

		System.out.println();

		System.out.printf("Salário com hora-extra mais desconto de Inss + Desconto de Imposto de Renda: R$ %.2f",calculoextra.DescontoIrrf());

		print.close();

	}

}
