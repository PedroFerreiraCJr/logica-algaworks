package br.com.algaworks.curso_logica._12_algoritmos_avancados;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		ListaAlunos alunos = new ListaAlunos();

		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		alunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		alunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Alexandre";
		alunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Normandes";
		alunos.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Thiago";
		alunos.adicionar(aluno5);

		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);
			if (a != null) {
				System.out.printf("Aluno: %s.%n", a.nome);
			}
		}
		System.out.println("--------------------------------");
		
		alunos.remover(aluno3);
		
		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);
			if (a != null) {
				System.out.printf("Aluno: %s.%n", a.nome);
			}
		}
		System.out.println("--------------------------------");
	}
}
