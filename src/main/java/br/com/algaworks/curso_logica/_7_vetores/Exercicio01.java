package br.com.algaworks.curso_logica._7_vetores;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		String[] tarefas = new String[5];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe as suas 5 principais tarefas do dia");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Digite a tarefa: [" + i + "]");
			String tarefa = scanner.nextLine();
			tarefas[i] = tarefa;
		}
		scanner.close();

		System.out.println("As tarefas cadastradas foram: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("[" + i + "] - " + tarefas[i]);
		}
	}
}
