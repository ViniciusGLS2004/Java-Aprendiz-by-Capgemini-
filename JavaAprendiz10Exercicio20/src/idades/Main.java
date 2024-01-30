package idades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scaner = new Scanner(System.in);

		
		for(int i = 1; i < 72; i++) {
			
			if(i >= 18) {
				System.out.println(i + " Maior de idade!");
			} else {
				System.out.println(i + " Menor de idade!");
			}
		}
	}

}
