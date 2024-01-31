package falencia;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);

		String nomeProduto;
		double CustoPreco;
		double CustoVenda;
		double MediaPreco = 0;
		double MediaVenda = 0;

		for (int i = 1; i < 41; i++) {
			System.out.println("Digite o nome do produto:");
			nomeProduto = scaner.next();

			System.out.println("Digite o preco do custo do produto:");
			CustoPreco = scaner.nextDouble();
			MediaPreco += CustoPreco;
			System.out.println("Preco do custo do produto: " + CustoPreco);

			System.out.println("Digite o preco de venda do produto:");
			CustoVenda = scaner.nextDouble();
			MediaVenda += CustoVenda;
			System.out.println("Preco de venda do produto: " + CustoVenda);

			if (CustoVenda > CustoPreco) {
				System.out.println("Houve lucro no produto!");
			} else if (CustoPreco > CustoVenda) {
				System.out.println("Houve prejuizo no produto!");
			} else {
				System.out.println("Houve empate no produto!");
			}
		}

		MediaPreco = MediaPreco / 40;
		MediaVenda = MediaVenda / 40;

		System.out.println("A media dos precos dos custos do produto é de: " + MediaPreco);
		System.out.println("A media dos precos das vendas do produto é de: " + MediaVenda);

		scaner.close();
	}

}
