package br.com.algaworks.curso_logica._04_operadores;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double valorProduto = scanner.nextDouble();

		Double valorFinalProduto = valorProduto;
		if (valorProduto < 100.0) {
			valorFinalProduto = valorProduto + 15.0d;
		}

		System.out.printf("O valor final do produto é: %.2f%n", valorFinalProduto);
		scanner.close();
	}
}
