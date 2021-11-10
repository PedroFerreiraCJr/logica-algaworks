package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();

		System.out.println("Nome completo: " + nome + " " + sobrenome);

		scanner.close();
	}
}
