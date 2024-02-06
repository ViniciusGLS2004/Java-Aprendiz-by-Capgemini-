package mediaaluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scaner = new Scanner(System.in);
		
		String NomeAluno;
		double NotaAluno;
		int contador = 0;
		String resposta = null;
		double MediaNota = 0;
		
		System.out.println("Digite o nome do Aluno:");
		NomeAluno = scaner.next();
		
		do {
			
			System.out.println("Digite a nota do aluno:");
			NotaAluno = scaner.nextDouble();
			
			if (NotaAluno < 0 || NotaAluno > 10) {
                System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                continue; // Volta para o início do loop sem contar a nota inválida
            }
			
			contador ++;
			MediaNota += NotaAluno;
			
			System.out.println("Deseja adcionar mais notas? sim/nao");
			resposta = scaner.next();
		}while(resposta.equalsIgnoreCase("sim"));
		
		if (contador > 0) {
            MediaNota = MediaNota / contador;
            System.out.println("Nome do Aluno: " + NomeAluno);
            System.out.println("A média das notas dele foi: " + MediaNota);
        } else {
            System.out.println("Nenhuma nota foi adicionada.");
        }
		
		scaner.close();

	}

}
