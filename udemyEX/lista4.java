package udemyEX;

import java.util.Scanner;

public class lista4 {

	/*
	 * 3. Problema "soma" Fazer um programa para ler dois valores inteiros X e Y, e
	 * depois mostrar na tela o valor da soma destes números.
	 */

	public static void main(String[] args) {

		int x, y, soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o valor de X: ");
		x = leia.nextInt();
		System.out.println("Entre com valor de Y: ");
		y = leia.nextInt();

		soma = x + y;

		System.out.println("Os números " + x + " e " + y + " , quando somados resultam em: " + soma);

	}

}
