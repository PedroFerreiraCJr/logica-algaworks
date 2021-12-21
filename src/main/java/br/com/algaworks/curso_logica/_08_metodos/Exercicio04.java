package br.com.algaworks.curso_logica._08_metodos;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o multiplicando: ");
		Integer multiplicando = scanner.nextInt();
		imprimirTabuada(multiplicando, 0);
		
		scanner.close();
	}
	
	static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.printf("%d x %d = %d%n", multiplicando, multiplicador, multiplicando * multiplicador);
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
}
