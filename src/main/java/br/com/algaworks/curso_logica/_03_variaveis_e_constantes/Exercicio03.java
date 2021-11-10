package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean maiorQueSetenta = nota > 70.0;
		if (maiorQueSetenta) {
			System.out.println("O aluno(a) passou!");
		}
		else {
			System.out.println("O aluno(a) está reprovado(a)");
		}

		scanner.close();
	}
}
