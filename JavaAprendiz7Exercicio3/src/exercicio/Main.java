package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		float totalCusto = 0.0f;
		float totalVenda = 0.0f;
		
		int i = 0;
		for (; i < 40; i++) {
			
			System.out.println("Digite o nome do produto:");
			nomeProduto = scaner.next();
			
			System.out.println("Digite o preço do produto:");
			precoCusto = scaner.nextFloat();
			
			System.out.println("Digite o preço de venda do produto:");
			precoVenda = scaner.nextFloat();
			
			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;
			
			if(precoCusto == precoVenda) {
				System.out.println("Houve um empate entre o preço de custo e venda");
				
			} else {
				if(precoCusto > precoVenda) {
					System.out.println("Prejuizo!");

				} else {
					System.out.println("Lucro!");
				}
			}
			System.out.println(nomeProduto + ", preço de custo = " + precoCusto + ", preço de venda = " + precoVenda);

		}
		System.out.println("A média do preço de custo é de:" +(totalCusto / i));
		System.out.println("A média do preço de venda é de:" +(totalVenda / i));

		scaner.close();
	}

}
