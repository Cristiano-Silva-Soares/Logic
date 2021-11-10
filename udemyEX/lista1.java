package udemyEX;

import java.util.Scanner;

public class lista1 {

	/*
	 * 1. Problema "terreno" Fazer um programa para ler as medidas da largura e
	 * comprimento de um terreno retangular com uma casa decimal, bem como o valor
	 * do metro quadrado do terreno com duas casas decimais. Em seguida, o programa
	 * deve mostrar o valor da área do terreno, bem como o valor do preço do
	 * terreno, ambos com duas casas decimais, conforme exemplo.
	 */

	public static void main(String[] args) {

		float larguraTerreno, compTerreno, metroQuadrado, areaTerreno, precoTerreno;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com a largura do terreno: ");
		larguraTerreno = leia.nextFloat();
		System.out.println("Entre com o comprimento do terreno: ");
		compTerreno = leia.nextFloat();
		System.out.println("Entre com o valor do terreno: ");
		metroQuadrado = leia.nextFloat();

		areaTerreno = larguraTerreno * compTerreno;
		precoTerreno = areaTerreno * metroQuadrado;

		System.out.printf("\nÁrea do Terreno: %.2f%n ", areaTerreno);
		System.out.printf("\nPreço do terreno: $ %.2f%n", precoTerreno);

	}

}
