package br.com.algaworks.curso_logica._09_orientacao_a_objetos.primeira_classe;

public class Produto {
	public static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
	
	public String nome;
	public Double precoUnitario;
	public Integer quantidade;
	
	public boolean produtoPrecisaSerRepostoNoEstoque() {
		return this.quantidade <= Produto.QUANTIDADE_MINIMA_ESTOQUE;
	}
}
