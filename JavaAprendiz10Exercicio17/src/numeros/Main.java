package numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Didite um numero entre 100 e 200");
		numero = scaner.nextInt();
		
		if (numero > 100 && numero < 200) {
			System.out.println("O numero esta entre 100 e 200, parabens :)");
		} else {
			System.out.println("O numero não esta entre 100 e 200 :( ");
		}
		scaner.close();
	}

}
