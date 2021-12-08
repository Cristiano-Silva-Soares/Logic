package fiapExRepeticaoArraysCollections;

public class Caixa {

	public static void main(String[] args) {

		int qtdeProdutos = 5;
		int registro = 0;

		// while(registro < qtdeProdutos) {
		// registro++;
		// System.out.println("O produto número " + registro + " foi registrado.");
		// }

		// do {
		// registro++;
		// System.out.println("O caixa registrou o produto: " + registro);
		// } while (registro < qtdeProdutos);

		// for (int i = 0; i < qtdeProdutos; i++) {
		// System.out.println("O caixa registrou o produto: " + i);
		// }
		
		 Produtos[] produtos = new Produtos[2];
		 
		 Produtos prod1 = new Produtos();
		 prod1.setNome("Limão");
		 prod1.setDescricao("Galego");
		 prod1.setValor(4.00);
		 
		 Produtos prod2 = new Produtos();
		 prod2.setNome("Maçã");
		 prod2.setDescricao("Gala");
		 prod2.setValor(5.00);
		 
		 produtos[0] = prod1;
		 produtos [1] = prod2;
		 
		 for ( int i = 0; i < produtos.length; i++) {
			 System.out.println(produtos[i].toString());
		 }
		 

	}

}
