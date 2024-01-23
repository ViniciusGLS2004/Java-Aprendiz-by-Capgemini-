package MediaConsumo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		int DistanciaPercorrida;
		int CombustivelTotal;
		float ConsumoMedio;
		
		System.out.println("Digite a distancia que o carro percorreu:");
		DistanciaPercorrida = scaner.nextInt();
		
		System.out.println("Digite o quanto de conbustivel foi usado: ");
		CombustivelTotal = scaner.nextInt();
		
		// essa é a formula para calcular o cosumo medio do combustivel de um altomovel
		ConsumoMedio = DistanciaPercorrida / CombustivelTotal;
		
		System.out.println("O automovel percorreu: " + ConsumoMedio  + " Km/L");
		
		scaner.close();
	}

}
