package udemyEX;

import java.util.Scanner;

public class lista5 {

	/*
	 * 5. Problema "troco" Fazer um programa para calcular o troco no processo de
	 * pagamento de um produto de uma mercearia. O programa deve ler o preço
	 * unitário do produto, a quantidade de unidades compradas deste produto, e o
	 * valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente).
	 * Seu programa deve mostrar o valor do troco a ser devolvido ao cliente.
	 */

	public static void main(String[] args) {

		float precoUnitario, quantidadeP, dinheiroRecebido, troco;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com o preço unitário do produto: ");
		precoUnitario = leia.nextFloat();
		System.out.println("Entre com a quantidade de produtos: ");
		quantidadeP = leia.nextFloat();
		System.out.println("Entre com o dinheiro recebido: ");
		dinheiroRecebido = leia.nextFloat();

		troco = (precoUnitario * quantidadeP) - dinheiroRecebido;

		System.out.printf("O valor a ser: %.2f%", troco);

	}

}
