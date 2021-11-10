package udemyEX;

import java.util.Scanner;

public class lista8 {

	/*
	 * 8. Problema "consumo" Fazer um programa para ler a distância total (em km)
	 * percorrida por um carro, bem como o total de combustível gasto por este carro
	 * ao percorrer tal distância. Seu programa deve mostrar o consumo médio do
	 * carro, com três casas decimais.
	 */

	public static void main(String[] args) {

		float distanciaP, combustivelG, consumoM;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com a distância percorrida pelo carro");
		distanciaP = leia.nextFloat();
		System.out.println("Entre com o combustível gasto na viagem: ");
		combustivelG = leia.nextFloat();

		consumoM = distanciaP / combustivelG;

		System.out.printf("O consumo médio foi de: %.3f%n", consumoM);

	}

}
