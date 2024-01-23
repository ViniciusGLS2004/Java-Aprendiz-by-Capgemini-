
package Meuprojeto;

import java.util.Scanner;

public class basico1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// comentario de linha
		
		/*
		 * minha primeira linha de comentario
		 * segunda linha de comentario
		 */
		
		/**
		 * comentario de documentação
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int idade = leitor.nextInt();
		float cotacaoDolar = leitor.nextFloat();
		double cotacaoEuro = leitor.nextDouble();
		String nome = leitor.nextLine();
		String codigoRua = leitor.next();
		
		System.out.println("Texto que será exibido no console.");
		System.out.print("texto que será exibido na tela.");
		
		System.out.println("Olá mundo, denovo!");
	}

}
