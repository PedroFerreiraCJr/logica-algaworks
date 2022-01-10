package br.com.algaworks.curso_logica._12_algoritmos_avancados;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos alunos = new ListaAlunos();

		Aluno aluno = new Aluno();
		aluno.nome = "João";
		alunos.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Maria";
		alunos.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Alexandre";
		alunos.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Normandes";
		alunos.adicionar(aluno);

		aluno = new Aluno();
		aluno.nome = "Thiago";
		alunos.adicionar(aluno);

		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);
			System.out.printf("Aluno: %s.%n", a.nome);
		}
	}
}
