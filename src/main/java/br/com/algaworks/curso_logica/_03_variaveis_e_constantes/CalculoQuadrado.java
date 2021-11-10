package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class CalculoQuadrado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor inteiro");
		Integer valor = scanner.nextInt();

		Long quadrado = (long) valor * valor;
		System.out.printf("O quadrado de %d é %d", valor, quadrado);

		scanner.close();
	}
}
