package udemyEX;

import java.util.Scanner;

public class lista2 {

	/*
	 * 2. Problema "retangulo" Fazer um programa para ler as medidas da base e
	 * altura de um retângulo. Em seguida, mostrar o valor da área, perímetro e
	 * diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
	 */

	public static void main(String[] args) {

		float baseR, alturaR, area, perimetro, diagonal;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com a base do retângulo: ");
		baseR = leia.nextFloat();
		System.out.println("\nEntre com a altura do retânfulo: ");
		alturaR = leia.nextFloat();

		area = (baseR * alturaR) / 2;
		perimetro = (baseR + alturaR) + area;
		diagonal = (area * area) + (baseR * baseR) + (alturaR * alturaR);

		System.out.println("\nÁrea: " + area);
		System.out.println("\nPerimetro: " + perimetro);
		System.out.println("\nDiagonal: " + diagonal);

	}

}
