package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.println("Digite a quantidade: ");
		Integer quantidade = scanner.nextInt();

		Double subtotal = valorProduto * quantidade;
		Boolean deveAplicarDesconto = quantidade > 10;
		Double desconto = 0.0;
		if (deveAplicarDesconto) {
			desconto = subtotal * 0.1;
		}

		Double total = subtotal - desconto;
		
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Desconto: " + desconto);
		System.out.println("O valor final da compra é: " + total);

		scanner.close();
	}
}
