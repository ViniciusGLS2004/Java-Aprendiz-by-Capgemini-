package media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		String nomeAluno;
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;

		System.out.println("Digite o seu nome: ");
		nomeAluno = scaner.next();

		System.out.println("Digite a sua primeira nota");
		nota1 = scaner.nextFloat();
		System.out.println("Digite a sua segunda nota");
		nota2 = scaner.nextFloat();
		System.out.println("Digite a sua terceira nota");
		nota3 = scaner.nextFloat();

		float MediaTotal = (nota1 + nota2 + nota3) / 3;

		if (MediaTotal >= 7) {
			System.out.println("Nome:" + nomeAluno + "\nSituação: Aprovado!");
		} else if (MediaTotal <= 5) {
			System.out.println("Nome:" + nomeAluno + "\nSituação: Reprovado!");
		} else if (MediaTotal >= 5.1 && MediaTotal <= 6.9) {
			System.out.println("Nome:" + nomeAluno + "\nSituação: Recuperação!");
		} else {
			System.out.println("Não foi possivel realizar a media, certifique-se de mandar todas as notas.");
		}

		scaner.close();
	}

}
