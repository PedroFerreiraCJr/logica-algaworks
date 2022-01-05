package br.com.algaworks.curso_logica._11_codigo_de_terceiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {
	public static void main(String[] args) throws EmailException {
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

		enviarTarefasPorEmail(tarefas);

		scanner.close();
	}

	static void enviarTarefasPorEmail(List<String> tarefas) throws EmailException {
		String msg = montarMensagem(tarefas);
		String assunto = "Curso Lógica - Suas tarefas";
		String destino = "pedroferreiracjr@gmail.com";

		Carteiro.enviar(destino, assunto, msg);
	}

	static String montarMensagem(List<String> tarefas) {
		String conteudo = "";
		for (int iteracao = 0; iteracao < tarefas.size(); iteracao++) {
			conteudo += tarefas.get(iteracao) + "\n";
		}

		return "Suas tarefas: \n\n" + conteudo;
	}
}
