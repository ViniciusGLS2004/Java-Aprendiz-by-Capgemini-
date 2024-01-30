package genero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		String nome;
		String sexo;
		int ContadorHomen = 0;
		int ContadorMulher = 0;

		for (int i = 1; i <= 56; i++) {
			System.out.println("Informe o nome da pessoa " + i + ": ");
			nome = scaner.next();
			System.out.println("Imforme o seu sexo: ");
			sexo = scaner.next();

			if (sexo.equals("homem")) {
                ContadorHomen++;
            } else if (sexo.equals("mulher")) {
                ContadorMulher++;
            } else {
                System.out.println("Sexo inválido. Por favor, digite 'homem' ou 'mulher'.");
                i--; // Para compensar a iteração inválida
            }
		}

		System.out.println("Totoal de Homens: " + ContadorHomen);
		System.out.println("Total de mulheres: " + ContadorMulher);

		scaner.close();
	}

}
