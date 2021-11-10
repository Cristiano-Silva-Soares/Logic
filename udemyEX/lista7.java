package udemyEX;

import java.util.Scanner;

public class lista7 {

	/*
	 * 7. Problema "pagamento" Fazer um programa para ler o nome de um(a)
	 * funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas
	 * trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário
	 * com uma mensagem explicativa, conforme exemplo.
	 */

	public static void main(String[] args) {

		String nome;
		float valorH, horasT, pag;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nEntre com o seu nome: ");
		nome = leia.next();
		System.out.println("\nEntre com o quanto você recebe por hora: ");
		valorH = leia.nextFloat();
		System.out.println("\nEntre com o valor das suas horas trabalhadas: ");
		horasT = leia.nextFloat();

		pag = valorH * horasT;

		System.out.printf("\nO pagamento para " + nome + " , deve ser de: %.2f%n", pag);

	}

}
