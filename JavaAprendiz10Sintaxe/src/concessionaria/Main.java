package concessionaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner (System.in);
		
		int anoFabric = 0;
		float valorCar = 0.0f;
		float valorDesconto = 0.0f;
		float porcentagemDesconto = 0.00f;
		float valorPagar = 0.0f;
		
		int totalCarrosSeminovos = 0;
		int totalCarros = 0;
		
		char desejaRepetir = 'S';
		
		while (desejaRepetir == 'S' || desejaRepetir == 's') {
			
			System.out.println("Digite o ano de fabricação do veiculo:");
			anoFabric = scaner.nextInt();
			
			System.out.println("Digite o valor do veiculo:");
			valorCar = scaner.nextInt();
			
			if(anoFabric <= 2000) {
				porcentagemDesconto = 0.12f;
			}else {
				porcentagemDesconto = 0.07f;
				totalCarrosSeminovos ++;
			}
				totalCarros++;
			
			valorDesconto = valorCar * porcentagemDesconto;
			valorPagar = valorCar - valorDesconto;
			
			System.out.println("O valor do desconto foi de: "+ valorDesconto);
			System.out.println("O valor que deve ser pago é de: "+ valorPagar);
			
			System.out.println("Deseja fazer mais cadastros? S - sim / N - não");
			desejaRepetir = scaner.next().charAt(0);
		}
		
		System.out.println("Total de carros semi novos: " + totalCarrosSeminovos);
		System.out.println("Total de carros: " + totalCarros);
		
		scaner.close();
	}

}
