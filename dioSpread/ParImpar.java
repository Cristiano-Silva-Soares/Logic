package dioSpread;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares e ímpares.
 * 
 */

public class ParImpar {

	public static void main(String[] args) {

		int n, numero;
		int par = 0;
		int impar = 0;
		int contador = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a quantidade de números(n) à serem digitados: ");
		n = leia.nextInt();

		do {
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}

			contador++;

		} while (contador < n);

		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);

	}

}
