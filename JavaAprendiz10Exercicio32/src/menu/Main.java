package menu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		String resposta;
		double numA;
		double numB;
		double Result;
		
		do {
			System.out.println("Escolha uma opção!"
					+ "\n1 - Calcular soma:"
					+ "\n2 - Calcular subtração:"
					+ "\n3 - Calcular multiplicação:"
					+ "\n4 - calcular divisão:");
			
			int opcao = scaner.nextInt();

			
			switch(opcao) {
			case 1:
				System.out.println("Digite o primeiro numero:");
				numA = scaner.nextDouble();
				System.out.println("Digite o segundo numero:");
				numB = scaner.nextDouble();
				Result = numA + numB;
				System.out.println("Resultado: " + Result);
				break;
			case 2:
				System.out.println("Digite o primeiro numero:");
				numA = scaner.nextDouble();
				System.out.println("Digite o segundo numero:");
				numB = scaner.nextDouble();
				Result = numA - numB;
				System.out.println("Resultado: " + Result);
				break;
			case 3:
				System.out.println("Digite o primeiro numero:");
				numA = scaner.nextDouble();
				System.out.println("Digite o segundo numero:");
				numB = scaner.nextDouble();
				Result = numA * numB;
				System.out.println("Resultado: " + Result);
				break;
			case 4:
				System.out.println("Digite o primeiro numero:");
				numA = scaner.nextDouble();
				System.out.println("Digite o segundo numero:");
				numB = scaner.nextDouble();
				Result = numA / numB;
				System.out.println("Resultado: " + Result);
				break;
			 default:
                 System.out.println("Opção inválida. Tente novamente.");
                 
			}
                 System.out.println("Deseja continuar? (sim/nao)");
                 resposta = scaner.next();

		}while(!resposta.equalsIgnoreCase("nao"));
		
		System.out.println("programa encerrado!");
		scaner.close();
	}
	

}
