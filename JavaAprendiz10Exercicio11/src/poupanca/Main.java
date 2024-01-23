package poupanca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		System.out.println("Digite o valor depositado: ");
		double deposito = scaner.nextDouble();
		
		double taxaMensal = 0.0007;
		
		int meses = 12;
		
		double rendimento = deposito * Math.pow(1 + taxaMensal, meses);
		
		System.out.printf("O valor com rendimento após um mês é: R$ %.2f%n", rendimento);

        scaner.close();
	}
	
	

}
