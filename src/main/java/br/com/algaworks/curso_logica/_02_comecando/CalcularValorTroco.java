package br.com.algaworks.curso_logica._02_comecando;

import java.util.Scanner;

public class CalcularValorTroco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite o valor do cliente: ");
		Double valorCliente = scanner.nextDouble();

		Double resultado = valorCliente - valorProduto;

		System.out.println("O troco a ser dado ao cliente é: " + resultado);

		scanner.close();
	}
}
