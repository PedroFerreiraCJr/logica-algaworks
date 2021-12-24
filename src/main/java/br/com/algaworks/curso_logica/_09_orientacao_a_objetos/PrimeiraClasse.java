package br.com.algaworks.curso_logica._09_orientacao_a_objetos;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 500.0d;
		produto.quantidade = 15;
		
		exibirQuantidadeEmEstoque(produto);
	}

	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Nome do produto: " + produto.nome);
		System.out.println("Quantidade em estoque: " + produto.quantidade);
	}
}
