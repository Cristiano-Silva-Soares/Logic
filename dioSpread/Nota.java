package dioSpread;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo até
 * que o usuário mostre o valor desejado.
 * 
 */

public class Nota {

	public static void main(String[] args) {

		double nota;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a sua nota: ");
		nota = leia.nextDouble();

		while (nota > 10 || nota < 0) {
			System.out.println("\nO valor informado deve ser entre 0 e 10!");
			System.out.println("\nEntre com a sua nota: ");
			nota = leia.nextDouble();
		}

		if (nota <= 10 || nota >= 0) {
			System.out.println("\nSua nota é: " + nota);
		}

	}

}
