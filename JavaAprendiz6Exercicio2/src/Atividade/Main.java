package Atividade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner (System.in);
		
		char  desejaContinuar = 'S';
		
		while (desejaContinuar == 'S' || desejaContinuar == 's') {
			
			System.out.println("Digite um numero:");
			int numero =  scaner.nextInt();
			
			if(numero == 0) {
				System.out.println("O numero é zero!");
			} else {
				if (numero > 0) {
					System.out.println("O numero é maior que zero!");	
				} else {
					System.out.println("O numero é menor que zero!");
				}
			}
			System.out.println("Deseja continuar? S - Sim / N - Nao");
			desejaContinuar = scaner.next().charAt(0);
		}
		System.out.println("Programa encerrado!");
		scaner.close();
	}

}
