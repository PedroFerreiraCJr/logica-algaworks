package br.com.algaworks.curso_logica._4_operadores;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe a idade: ");
		int idade = scanner.nextInt();

		System.out.print("Informe tempo de contribuição: ");
		int tempoDeContribuicao = scanner.nextInt();

		if (idade >= 55 && tempoDeContribuicao >= 25) {
			System.out.println("Você tem condições de se aposentar.");
		}

		scanner.close();
	}
}
