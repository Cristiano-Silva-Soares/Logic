package dioSpread;

import java.util.Scanner;

/*
 * Fa�a um programa que leia 5 n�meros e retorne o maior entre os mesmos
 * e sua m�dia final.
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
			System.out.println("Entre com um n�mero: ");
			numero = leia.nextInt();

			soma += numero;

			if (numero > maiorNumero) {
				maiorNumero = numero;
			}

			contador++;

		} while (contador < 5);

		media = soma / 5;

		System.out.println("Maior n�mero: " + maiorNumero);
		System.out.println("Media dos n�meros: " + media);

	}

}
