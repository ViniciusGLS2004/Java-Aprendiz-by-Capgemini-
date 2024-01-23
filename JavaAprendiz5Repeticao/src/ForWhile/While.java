package ForWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);

		int totalAlunos = 2;
		while(totalAlunos > 0) {
			
			String nome = scaner.nextLine();
			int idade = scaner.nextInt();
			
			System.out.println("O nome do aluno é : " + nome + "e sua idade é : " + idade);
			
			totalAlunos = totalAlunos - 1;
			
		}
		System.out.println("Não há mais alunos para cadastrar!");
		scaner.close();
	}

}
