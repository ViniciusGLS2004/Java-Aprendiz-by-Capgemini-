package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um valor!");
		numero = scaner.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			System.out.println("O número está no intervalo.");
		} else {
			System.out.println("O número não está no intervalo.");
		}
		
		scaner.close(); // Fechando o Scanner

	}

}
