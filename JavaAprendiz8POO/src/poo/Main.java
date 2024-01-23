package poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		//double peso;
		//double altura;
		Pessoa objetoPessoa = new Pessoa(0, 0);
		//double imc;
		
		System.out.println("Digite o seu peso:");
		objetoPessoa.setPeso(scaner.nextFloat());
		
		System.out.println("Digite a sua altura:");
		objetoPessoa.setAltura(scaner.nextFloat());
		
		objetoPessoa.getPeso();
		
		System.out.println("imc = " + objetoPessoa.calcularIMC());
		
		scaner.close();


	}

}
