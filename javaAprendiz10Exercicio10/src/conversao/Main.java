package conversao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		float reais;
		float cotacao;
		float dolar;
		
		System.out.println("Digite quantos dolares voce tem: ");
		dolar = scaner.nextFloat();
		
		System.out.println("Digite o valor da cotação do dolar para o real: ");
		cotacao = scaner.nextFloat();
		
		reais = dolar * cotacao;
		
		System.out.printf("O valor em reais é RS %.2f%n", reais);
		
		scaner.close();
		
		
	}

}
