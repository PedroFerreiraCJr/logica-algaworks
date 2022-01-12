package br.com.algaworks.curso_logica._12_algoritmos_avancados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio01 {
	public static void main(String[] args) throws IOException {
		List<String> linhas = lerLinhas();
		List<Aluno> lista = fromListString(linhas);
		ListaAlunos alunos = fromListAluno(lista);
		alunos.ordenar2();
		escreverLinhas(alunos);
	}

	static void iterar(ListaAlunos alunos) {
		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno a = alunos.obter(i);
			if (a != null) {
				System.out.printf("Aluno: %s.%n", a.nome);
			}
		}
		System.out.println("--------------------------------");
	}

	static List<String> lerLinhas() throws IOException {
		Path arquivo = Paths.get("/tmp/ordenacao.txt");
		return Files.readAllLines(arquivo);
	}

	static void escreverLinhas(ListaAlunos alunos) throws IOException {
		Path arquivo = Paths.get("/tmp/alunos-ordenados.txt");
		Files.write(arquivo, fromListaAlunos(alunos));
	}

	static List<Aluno> fromListString(List<String> lista) {
		return lista.stream().map((String nome) -> new Aluno(nome)).collect(Collectors.toList());
	}

	static ListaAlunos fromListAluno(List<Aluno> lista) {
		ListaAlunos alunos = new ListaAlunos();
		lista.forEach((Aluno a) -> alunos.adicionar(a));
		return alunos;
	}

	static List<String> fromListaAlunos(ListaAlunos alunos) {
		List<String> linhas = new ArrayList<>();
		for (int i = 0; i < alunos.tamanho(); i++) {
			Aluno aluno = alunos.obter(i);
			linhas.add(aluno.nome);
		}
		return linhas;
	}
}
