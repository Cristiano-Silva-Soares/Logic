package budChallenge;

import java.util.Scanner;

public class BudMath {

	// Crie uma fun��o que recebe um n�mero qualquer e encontra o maior n�mero
	// formado por d�gitos
	// consecutivos daquele n�mero.

	public static void main(String[] args) {

		String entrada;
		String parcial = "";
		String resultado = "";

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com alguns n�meros e veja a m�gica acontecer: ");
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

		System.out.println("\nA m�gica: " + resultado);
	}

}
