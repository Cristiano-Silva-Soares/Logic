package dioSpread;

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {

		/*
		 * Faça um progrma que leia conjuntos de dois valores, o primeiro representando
		 * o nome do aluno e o segundo representando sua idade. (Pare o programa
		 * inserindo o valor zero no campo referido.)
		 * 
		 */

		String nome;
		int numero, idade;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nEntre com o seu nome: ");
			nome = leia.next();
			System.out.println("\nEntre com a sua idade");
			idade = leia.nextInt();

			System.out.println("\nNome do aluno: " + nome + "\nIdade do aluno: " + idade);

			System.out.println("\n Para refazer a operação digite 1, e para cancelar a mesma digite 0: ");
			numero = leia.nextInt();
		} while (numero != 0);

		System.out.println("\nObrigado por usar nossos serviços!");

	}

}
