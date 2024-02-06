package maisnumeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		Integer numero;

		System.out.println("Digite numeros por extenso em um intervalo de 1 a 5:");
		numero = scaner.nextInt();

		// Quando o usuário digita o número 1, o programa acessa numerosPorExtenso[1],
		// que contém a string "Um".
		String[] numerosPorExtenco = { "", "Um", "Dois", "Tres", "Quatro", "Cinco" };

		if (numero > 1 && numero < 5) {
			System.out.println(numerosPorExtenco[numero]);

		} else {
			System.out.println("Numero invalido, ele não esta no intervalo!");
		}

		scaner.close();

	}

}
