package fiapExRepeticaoArraysCollections;

public class Produtos {

	String nome;
	String descricao;
	double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double d) {
		this.valor = d;
	}
	
	@Override
	public String toString() {
		return "Produto [nome =" + nome + ", descrição=" + descricao + ", valor= " + valor + "]";
		
	}

}
