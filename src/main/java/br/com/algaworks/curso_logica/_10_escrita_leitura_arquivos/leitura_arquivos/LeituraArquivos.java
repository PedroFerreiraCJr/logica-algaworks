package br.com.algaworks.curso_logica._10_escrita_leitura_arquivos.leitura_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("/tmp/minhas-tarefas.txt");
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (int i=0; i<linhas.size(); i++) {
			String tarefa = linhas.get(i);
			System.out.println("Nome da tarefa: " + tarefa);
		}
	}
}
