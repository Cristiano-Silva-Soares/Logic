package budChallenge;

import java.util.Scanner;

public class BudMath {

	// Crie uma função que recebe um número qualquer e encontra o maior número
	// formado por dígitos
	// consecutivos daquele número.

	public static void main(String[] args) {

		String entrada;
		String parcial = "";
		String resultado = "";

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com alguns números e veja a mágica acontecer: ");
		entrada = leia.next();

		for (int i = 1; i < entrada.length(); i++) {

			if (entrada.charAt(i) - 1 == entrada.charAt(i - 1)) {
				parcial += entrada.charAt(i - 1);
			} else if (entrada.charAt(i) == '0' && entrada.charAt(i - 1) == '9') {
				parcial += entrada.charAt(i - 1);
			} else {
				parcial += entrada.charAt(i - 1);

				if (parcial.length() > resultado.length()) {
					resultado = parcial;
				}
				parcial = "";
			}

			if (i == entrada.length() - 1) {
				if (entrada.charAt(i) - 1 == entrada.charAt(i - 1)) {
					parcial += entrada.charAt(i);

					if (parcial.length() > resultado.length()) {
						resultado = parcial;
					}
				} else if (entrada.charAt(i) == '0' && entrada.charAt(i - 1) == '9') {
					parcial += entrada.charAt(i);

					if (parcial.length() > resultado.length()) {
						resultado = parcial;
					}
				}

			}
		}

		System.out.println("\nA mágica: " + resultado);
	}

}
