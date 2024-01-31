package algoritmo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		int numero;
		String resposta;
		while (true) {
			System.out.println("Digite um numero aleatorio:");
			numero = scaner.nextInt();
			
			if(numero > 0) {
				System.out.println("O numero é positivo!");
			} else if(numero < 0) {
				System.out.println("O numero é negativo!");
			} else {
				System.out.println("O numero é zero!");
			}
			
			System.out.println("Deseja continuar o teste? (sim/nao)");
			resposta = scaner.next();
			if(resposta.equalsIgnoreCase("nao")) {
				break;
			}

	}
		System.out.println("Programa encerrado!");
		scaner.close();
}
}