package udemyEX;

import java.util.Scanner;

public class lista8 {

	/*
	 * 8. Problema "consumo" Fazer um programa para ler a dist�ncia total (em km)
	 * percorrida por um carro, bem como o total de combust�vel gasto por este carro
	 * ao percorrer tal dist�ncia. Seu programa deve mostrar o consumo m�dio do
	 * carro, com tr�s casas decimais.
	 */

	public static void main(String[] args) {

		float distanciaP, combustivelG, consumoM;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com a dist�ncia percorrida pelo carro");
		distanciaP = leia.nextFloat();
		System.out.println("Entre com o combust�vel gasto na viagem: ");
		combustivelG = leia.nextFloat();

		consumoM = distanciaP / combustivelG;

		System.out.printf("O consumo m�dio foi de: %.3f%n", consumoM);

	}

}
