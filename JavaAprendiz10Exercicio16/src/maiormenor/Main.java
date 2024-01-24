package maiormenor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		int numA;
		int numB;

		System.out.println("Digite um valor para o A:");
		numA = scaner.nextInt();
		System.out.println("Digite um valor para o B:");
		numB = scaner.nextInt();

		if (numA > numB) {
			System.out.println("O numero A é maior do que o B");
		} else if (numB > numA) {
			System.out.println("O numero B é maior do que o numero A");
		} else {
			System.out.println("O numero A e o numero B São iguais!");
		}
		scaner.close();
	}

}
