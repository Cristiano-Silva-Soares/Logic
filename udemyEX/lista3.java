package udemyEX;

import java.util.Scanner;

public class lista3 {

	/*
	 * 3.Problema "idades" Fazer um programa para ler o nome e idade de duas
	 * pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre
	 * essas pessoas, com uma casa decimal.
	 */

	public static void main(String[] args) {

		String nome1, nome2;
		float idade1, idade2, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nOlá pessoa 1! Entre com seu nome: ");
		nome1 = leia.next();
		System.out.println("\nEntre com a sua idade: ");
		idade1 = leia.nextFloat();

		System.out.println("\nOlá pessoa 2! Entre com seu nome: ");
		nome2 = leia.next();
		System.out.println("\nEntre com a sua idade: ");
		idade2 = leia.nextFloat();

		media = (idade1 + idade2) / 2;

		System.out.printf("\nA idade média entre " + nome1 + " e " + nome2 + " , chega a ser de: %.1f%n", media);

	}

}
