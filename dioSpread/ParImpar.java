package dioSpread;

import java.util.Scanner;

/*
 * Fa�a um programa que pe�a N n�meros inteiros,
 * calcule e mostre a quantidade de n�meros pares e �mpares.
 * 
 */

public class ParImpar {

	public static void main(String[] args) {

		int n, numero;
		int par = 0;
		int impar = 0;
		int contador = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe a quantidade de n�meros(n) � serem digitados: ");
		n = leia.nextInt();

		do {
			System.out.println("Entre com um n�mero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}

			contador++;

		} while (contador < n);

		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);

	}

}
