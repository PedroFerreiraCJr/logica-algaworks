package br.com.algaworks.curso_logica._09_orientacao_a_objetos.classe_instancia;

public class ClasseInstancia {
	public static void main(String[] args) {
		System.out.println("Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque);

		/**
		 * A declaração de uma instância geralmente é atribuída a uma variável, e usa o
		 * operador <strong>new</strong>.
		 */
		Produto produto = new Produto();
//		produto.quantidadeMinimaEstoque = 10;	// Perceba que o Eclipse gera um aviso de compilação neste tipo de acesso
		produto.nome = "Caneca";
//		System.out.println("Quantidade mínima estoque: " + produto.quantidadeMinimaEstoque);

		Produto produto2 = new Produto();
//		produto2.quantidadeMinimaEstoque = 100;	// Perceba que o Eclipse gera um aviso de compilação neste tipo de acesso
		produto2.nome = "Carteira";

		System.out.println("Produto 01: " + produto.nome);
		System.out.println("Produto 02: " + produto2.nome);
//		System.out.println("Quantidade mínima estoque: " + produto2.quantidadeMinimaEstoque);

		Impressao.info("Produto 01: " + produto.nome);
	}
}
