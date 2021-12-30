package br.com.algaworks.curso_logica._09_orientacao_a_objetos.metodo_instancia;

import br.com.algaworks.curso_logica._09_orientacao_a_objetos.primeira_classe.Produto;

public class Exercicio02 {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.precoUnitario = 1000.0;
		produto.quantidade = 5;
		
		boolean precisaRepor = produto.produtoPrecisaSerRepostoNoEstoque();
		if (precisaRepor) {
			System.out.printf("O produto %s precisa ser reposto no estoque.%n", produto.nome);
		}
		else {
			System.out.printf("O produto %s não precisa ser reposto no estoque.%n", produto.nome);
		}
	}
}
