package carangovelho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);

		int ValorVeiculo = 0;
		double ValorVeiculoTotal;
		int DataVeiculo = 0;
		int ContadorCarros = 0;
		double ToTalGeral = 0;

		while (true) {

			System.out.println("Digite o valor do veiculo: ");
			ValorVeiculo = scaner.nextInt();

			System.out.println("Digite o ano do carro: ");
			DataVeiculo = scaner.nextInt();

			if (DataVeiculo <= 2000) {
				ContadorCarros++;
				ValorVeiculoTotal = ValorVeiculo * (1 - 0.12);
				ToTalGeral = ToTalGeral + ValorVeiculoTotal;
				System.out.println("O desconto será de 12%!");
				System.out.println("O valor do carro com o desconto sera de: " + ValorVeiculoTotal);

			} else {
				ValorVeiculoTotal = ValorVeiculo * (1 - 0.07);
				ToTalGeral = ToTalGeral + ValorVeiculoTotal;
				System.out.println("O desconto será de 7%!");
				System.out.println("O valor do carro com o desconto sera de: " + ValorVeiculoTotal);
			}

			System.out.println("Deseja adcionar um novo carro na compra? sim/nao");
			String resposta = scaner.next();
			if (resposta.equalsIgnoreCase("sim")) {
				System.out.println("Vamos adcionar um novo carro a compra!");
			} else {
				System.out.println("Encerrando o programa.");
				break; // Encerra o loop se o usuário digitar 'sair'
			}

		}

		System.out.println("Total de carros com ano até 2000 : " + ContadorCarros);
		System.out.println("Total geral de todos os carros seria de: " + ToTalGeral + " Reais");
		
		scaner.close();

	}
}
