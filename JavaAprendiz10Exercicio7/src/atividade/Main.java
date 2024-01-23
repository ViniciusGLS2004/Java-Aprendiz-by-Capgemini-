package atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		String nomeAluno;
		float av1;
		float av2;
		float av3;
		float notaTotal;
		
		System.out.println("Digite seu nome: ");
		nomeAluno = scaner.next();
		
		System.out.println("Digite a sua primeira nota: ");
		av1 = scaner.nextFloat();
		
		System.out.println("Digite a sua segunda nota: ");
		av2 = scaner.nextFloat();
		
		System.out.println("Digite a sua terceira nota: ");
		av3 = scaner.nextFloat();
		
		// media artimetica:
		notaTotal = (av1 + av2 + av3)/ 3;
		
		System.out.printf("Nome: %s%nMédia do aluno: %.2f%n", nomeAluno, notaTotal);

		scaner.close();
	}

}
