package imPar;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		// Escreva um programa em java que receba um número inteiro e retorne true caso o número seja par, e false caso contrário
		
		int n;
		
		System.out.print("Digite um numero: ");
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}