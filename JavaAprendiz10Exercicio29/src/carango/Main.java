package carango;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scaner = new Scanner(System.in);
		
		double ValorVeiculo;
		String CombustivelVeiculo;
		double DescontoVeiculo;
		double ContadorDesconto = 0;
		double TotalValorPago = 0;
		
		while(true) {
			System.out.println("Digite o valor do veiculo:");
			ValorVeiculo = scaner.nextDouble();
			
			if(ValorVeiculo == 0) {
				System.out.println("programa encerrado!");
				break;
			}
			
			System.out.println("Digite o tipo de combustivel do veiculo:");
			CombustivelVeiculo = scaner.next();
			
			if(CombustivelVeiculo.equalsIgnoreCase("alcool")) {
				DescontoVeiculo = 0.25 * ValorVeiculo;
				
			} else if(CombustivelVeiculo.equalsIgnoreCase("gasolina")) {
				DescontoVeiculo = 0.21 * ValorVeiculo;
				
			} else if(CombustivelVeiculo.equalsIgnoreCase("diesel")) {
				DescontoVeiculo = 0.14 * ValorVeiculo;

			} else {
                System.out.println("Tipo de combustível inválido. Tente novamente.");
                continue; // Volta para o início do loop para nova entrada
            } 
			
			 // Atualiza os totais
            ContadorDesconto += DescontoVeiculo;
            double valorPago = ValorVeiculo - DescontoVeiculo;
            TotalValorPago += valorPago;

            // Exibe os resultados
            System.out.println("Desconto: " + DescontoVeiculo);
            System.out.println("Valor a ser pago: " + valorPago);
        
			
		}
		System.out.println("Total de desconto de todos os carros foi de : " + ContadorDesconto + " Reais");
		System.out.println("Total do valor pago pelos clientes de todos os carros foi de : " + TotalValorPago + " Reais");
		
		scaner.close();
	}

}
