package br.com.algaworks.curso_logica._10_escrita_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
	public static void main(String[] args) throws IOException {
		ArrayList<String> linhas = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe o nome: ");
			String nome = scanner.nextLine();
			linhas.add(nome);
		}
		scanner.close();
		
		Path arquivo = Paths.get("/tmp/meu-arquivo.txt");
		Files.write(arquivo, linhas);
		System.out.println("Arquivo escrito com sucesso!");
	}
}
