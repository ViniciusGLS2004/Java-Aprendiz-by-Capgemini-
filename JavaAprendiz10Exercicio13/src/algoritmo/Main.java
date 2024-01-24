package algoritmo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		int PercentProduto = 0;
		double ValorPorduto = 0;
		
		System.out.println("Digite o valor do produto: ");
		ValorPorduto = scaner.nextDouble();
		System.out.print(ValorPorduto);
		
		System.out.println("\nDigite a porcentagem que tera acrescimo no valor do produto: ");
		PercentProduto = scaner.nextInt();
		System.out.print(PercentProduto);
		
		double acrescimo = 1 + PercentProduto / 100.0;
		System.out.print("\n" + acrescimo);
		
		double ValorVendaFinal = ValorPorduto * acrescimo;
		
		System.out.println("\nO valor final do produto sera de: " + ValorVendaFinal + " Reais!");
		
		scaner.close();
	}

}
