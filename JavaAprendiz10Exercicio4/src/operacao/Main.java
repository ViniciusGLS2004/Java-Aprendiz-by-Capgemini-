package operacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = scaner.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		num2 = scaner.nextFloat();
		
		System.out.println("A soma dos numero é igual a: " + (num1 + num2));
		System.out.println("A subtração dos numero é igual a: " + (num1 - num2));
		System.out.println("A multiplicação dos numero é igual a: " + (num1 * num2));
		System.out.println("A divisão dos numero é igual a: " + (num1 / num2));
		
		scaner.close();
	}

}
