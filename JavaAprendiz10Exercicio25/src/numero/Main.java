package numero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		int numero;
		while (true) {
			System.out.println("Digite um numero entre 0 a 100, existe uma mensagem secreta se vocer acertar o numero:");
			numero = scaner.nextInt();

			if (numero > 80 || numero < 25 || numero == 40) {
				System.out.println("Parabens,o seu número é maior que 80, menor que 25 ou igual a 40!");
				break;
			} else {
				System.out.println("Numero errado, tente novamente");
			}
						
		}
		System.out.println("Programa encerrado!");
		scaner.close();
	}

}
