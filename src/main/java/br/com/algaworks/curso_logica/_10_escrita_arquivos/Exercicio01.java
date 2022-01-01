package br.com.algaworks.curso_logica._10_escrita_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		String input = null;
		List<String> tarefas = new ArrayList<String>();
		while (true) {
			System.out.println("Digite o caractere 'x' para terminar.");
			System.out.print("Informe a tarefa: ");
			input = scanner.nextLine();
			
			if ("x".equals(input)) {
				break;
			}
			
			tarefas.add(input);
		}

		salvarTarefas(tarefas);
		
		scanner.close();
	}

	static void salvarTarefas(List<String> tarefas) throws IOException {
		imprimir("Salvando...");
		Files.write(Paths.get("/tmp/minhas-tarefas.txt"), tarefas);
		imprimir("Arquivo salvo com sucesso!");
	}

	static void imprimir(String texto) {
		System.out.println("[INFO] " + texto);
	}
}
