package udemyEX;

import java.util.Scanner;

public class lista6 {

	/*
	 * 6. Problema "circulo" Fazer um programa para ler o valor "r" do raio de um
	 * círculo, e depois mostrar o valor da área do círculo com três casas decimais.
	 * A fórmula da área do círculo é a seguinte: area = π. r² . Você pode usar o
	 * valor de π fornecido pela biblioteca da sua linguagem de programação, ou
	 * então, se preferir, use diretamente o valor 3.14159.
	 */

	public static void main(String[] args) {
		
		float r, areaC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com valor de R: ");
		r = leia.nextFloat();
		
		
		
		areaC = 314159 * (r * r);
		
		
		System.out.printf("\n O valor da área do círculo representa: %.3f%n", areaC);

	}

}
