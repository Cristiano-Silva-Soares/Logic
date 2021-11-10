package udemyEX;

import java.util.Scanner;

public class lista9 {

	/*
	 * 9.Problema "medidas" Fazer um programa para ler trÍs medidas A, B e C. Em
	 * seguida, calcular e mostrar (imprimir os dados com quatro casas decimais): a)
	 * a ·rea do quadrado que tem lado A b) a ·rea do tri‚ngulo ret‚ngulo que base A
	 * e altura B c) a ·rea do trapÈzio que tem bases A e B, e altura C
	 */

	public static void main(String[] args) {

		float a, b, c, areaQ, areaT, areaR;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com valor de A: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextFloat();

		areaQ = a * a;
		areaT = a * b;
		areaR = (a + b) * c;

		System.out.printf("\n¡rea do quadrado: %.3f%n", areaQ);
		System.out.printf("\n¡rea do tri‚ngulo: %.3f%n", areaT);
		System.out.printf("\n¡rea do ret‚ngulo: %.3f%n", areaR);

	}

}
