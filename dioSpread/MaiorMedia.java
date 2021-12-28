package dioSpread;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números e retorne o maior entre os mesmos
 * e sua média final.
 * 
 */

public class MaiorMedia {

	public static void main(String[] args) {

		int numero, media;
		int contador = 0;
		int maiorNumero = 0;
		int soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();

			soma += numero;

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

			contador++;

		} while (contador < 5);

		media = soma / 5;

		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Media dos números: " + media);

	}

}
