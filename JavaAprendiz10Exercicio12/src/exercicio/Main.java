package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		double ValorProduto = 0;
		int NumPrestacoes = 5;

		System.out.println("Digite o valor do produto: ");
		ValorProduto = scaner.nextDouble();

		double ValorPrestacoes = ValorProduto / NumPrestacoes;

		System.out.println("A prestação do produto durante os 5 meses ficaria de: " + ValorPrestacoes);

		scaner.close();
	}

}
