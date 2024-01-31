package maiormenor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		int numA;
		int numB;
		String resposta;
		
		System.out.println("Digite o numero a A!");
		numA = scaner.nextInt();
		
		System.out.println("Digite o numero a B!");
		numB = scaner.nextInt();
		
		if(numA == numB) {
			System.out.println("O numero A é igual ao numero B");
		} else if(numA != numB) {
				while(true) {
					System.out.println("O numero A e o numero B são diferentes!");
					if (numA > numB) {
						System.out.println("O numero A é maior do que o numero B");
					} else {
						System.out.println("O numero B é maior do que o numero A");
					}
					System.out.println("Deseja parar o programa? (sim/nao)");
					resposta = scaner.next();
					if(resposta.equalsIgnoreCase("sim")) {
						break;
					}
				}
		}
		System.out.println("Número A: " + numA);
		System.out.println("Número B: " + numB);
		System.out.println("Programa encerrado!");
		scaner.close();
		
	}

}
