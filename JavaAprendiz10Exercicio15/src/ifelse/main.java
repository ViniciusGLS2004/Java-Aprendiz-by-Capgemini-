package ifelse;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero, se ele for maior que 10 vai aparecer uma mensagem: ");
		numero = scaner.nextInt();
		
		if(numero > 10) {
			System.out.println("Voce digitou um numero maior que 10, parabens!");
		} else {
			System.out.println("O numero é menor que 10, não vai aparecer nenhuma mensagem :|");
		}
		
		scaner.close();
	}

}
