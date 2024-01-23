package Vendedor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		String nome;
		float SalarioFixo;
		float TotalVendas;
		float SalarioFinal;
		
		System.out.println("Imforme o seu nome: ");
		nome = scaner.next();
		
		System.out.println("Digite o salário fixo: ");
		SalarioFixo = scaner.nextFloat();
		
		System.out.println("Digite o total de vendas: ");
		TotalVendas = scaner.nextFloat();
		
		SalarioFinal = SalarioFixo + (TotalVendas * 0.15f);
		
        System.out.printf("Nome: %s%nSalário fixo: %.2f%nSalário final: %.2f%n", nome, SalarioFixo, SalarioFinal);
	
		scaner.close();
	}

}
