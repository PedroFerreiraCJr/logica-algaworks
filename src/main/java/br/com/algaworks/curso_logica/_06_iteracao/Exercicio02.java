package br.com.algaworks.curso_logica._06_iteracao;

public class Exercicio02 {
	public static void main(String[] args) {
		final Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
				20 };

		int i = 0;
		while (i < numeros.length) {
			final Integer numero = numeros[i];
			if (numero % 3 == 0) {
				System.out.printf("Divisível por três encontrado: %d%n", numero);
			}
			i++;
		}
	}
}
