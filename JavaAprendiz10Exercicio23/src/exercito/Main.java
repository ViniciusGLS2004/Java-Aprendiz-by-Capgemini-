package exercito;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		
		String nome;
		int idade;
		String sexo;
		int saude;
		int ContadorApto = 0;
		int ContadorNaoApto = 0;
		String resposta;
		
		while(true) {
			System.out.println("Alistamento do exercito!\n");
			
			System.out.println("Imforme o seu nome: ");
			nome = scaner.next();
			
			System.out.println("Imforme a sua idade:");
			idade = scaner.nextInt();
			
			System.out.println("Imforme o seus sexo:");
			sexo = scaner.next();
			
			System.out.println("Imforme o estado de sua saude entre 1 a 10:");
			saude = scaner.nextInt();
			
			if (idade < 18) {
				System.out.println("A sua idade é menor que 18 anos, voce não esta apta(o) para entrar no exercito");
				ContadorNaoApto ++;
			} else if(saude < 5) {
				System.out.println("A sua saude é menor que a media, voce não esta apta(o) para entrar no exercito");
				ContadorNaoApto ++;
			} else {
				System.out.println("Voce esta apto(a) para entrar no exercito, parabens!");
				ContadorApto ++;
			}
			System.out.println("Deseja continuar o programa? (sim/nao)");
			resposta = scaner.next();
			if(resposta.equalsIgnoreCase("nao")) {
				break;
			}
		}
		
		System.out.println("programa encerrado!");
		System.out.println("Total de pessoas aptas: " + ContadorApto);
		System.out.println("Total de pessoas não aptas: " + ContadorNaoApto);
		
		scaner.close();
	}

}
