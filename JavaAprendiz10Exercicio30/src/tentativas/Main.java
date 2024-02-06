package tentativas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		int numero;
		int tentativas = 0;
		do {
			System.out.println("Digite um numero de 1 a 100:");
			numero = scaner.nextInt();
			tentativas++;

			if (numero < 80) {
				System.out.println("Tente um número maior.");
			} else if (numero > 80) {
				System.out.println("Tente um número menor.");
			}

		} while (numero != 80);
		System.out.println("Parabens, voce encerrrou o programa!");
		System.out.println("Foram " + tentativas + " tentativas!");

		scaner.close();
	}

}
