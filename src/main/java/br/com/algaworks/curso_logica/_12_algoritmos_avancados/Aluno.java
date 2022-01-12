package br.com.algaworks.curso_logica._12_algoritmos_avancados;

public class Aluno {
	String nome;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome) {
		super();
		this.nome = nome;
	}
	
	boolean vemDepoisDe(Aluno aluno) {
		if (aluno == null) {
			return false;
		}
		return this.nome.compareTo(aluno.nome) > 0;
	}
}
