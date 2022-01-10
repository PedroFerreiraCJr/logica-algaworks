package br.com.algaworks.curso_logica._12_algoritmos_avancados;

public class ListaAlunos {
	static final int QUANTIDADE_LISTA = 5;

	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	int tamanhoLista = 0;

	Aluno obter(int indice) {
		return lista[indice];
	}

	int tamanho() {
		return tamanhoLista;
	}

	void adicionar(Aluno aluno) {
		if (lista.length == tamanhoLista) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}

			lista = novaLista;
		}

		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
}
