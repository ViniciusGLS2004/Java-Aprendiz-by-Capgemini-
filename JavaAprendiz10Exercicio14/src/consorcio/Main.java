package consorcio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Declaração de variáveis
		double custoCarroTotal;
		double custoFabrica;
		double percentualDistribuidor = 0.45; // Percentual do distribuidor (45%)

		System.out.println("Digite o custo de fábrica do carro:");
		custoFabrica = scanner.nextDouble();

		// Calcula o custo total considerando o percentual do distribuidor
		double somaTotalCustoFabrica = custoFabrica + (custoFabrica * percentualDistribuidor);

		// Percentual de impostos sobre o custo de fábrica
		double percentualImposto = 0.28; // Percentual de impostos (28%)

		// Calcula o percentual total do distribuidor sobre o resultado anterior
		double percentualTotalDistribuidor = 1 + percentualImposto;

		// Calcula o custo total do carro para o consumidor
		custoCarroTotal = somaTotalCustoFabrica * percentualTotalDistribuidor;

		System.out.println("O custo total do carro para o consumidor será de " + custoCarroTotal + " Reais");

		scanner.close();
	}
}
