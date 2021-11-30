package br.com.algaworks.curso_logica._4_operadores;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double valorTotalDosGastosDaFamilia = 0d;

		System.out.print("Valor conta de luz: ");
		double valorContaDeLuz = scanner.nextDouble();
		if (valorContaDeLuz > 0d) {
			valorTotalDosGastosDaFamilia += valorContaDeLuz;
		}

		System.out.print("Valor conta de água: ");
		double valorContaDeAgua = scanner.nextDouble();
		if (valorContaDeAgua > 0d) {
			valorTotalDosGastosDaFamilia += valorContaDeAgua;
		}

		System.out.print("Valor conta de telefone: ");
		double valorContaDeTelefone = scanner.nextDouble();
		if (valorContaDeTelefone > 0d) {
			valorTotalDosGastosDaFamilia += valorContaDeTelefone;
		}

		System.out.print("Valor escola do filho: ");
		double valorContaEscolaDoFilho = scanner.nextDouble();
		if (valorContaEscolaDoFilho > 0d) {
			valorTotalDosGastosDaFamilia += valorContaEscolaDoFilho;
		}

		System.out.print("Valor fatura do cartão: ");
		double valorContaFaturaDoCartao = scanner.nextDouble();
		if (valorContaFaturaDoCartao > 0d) {
			valorTotalDosGastosDaFamilia += valorContaFaturaDoCartao;
		}

		System.out.print("Valor gastos com supermercado: ");
		double valorContaGastosSupermercado = scanner.nextDouble();
		if (valorContaGastosSupermercado > 0d) {
			valorTotalDosGastosDaFamilia += valorContaGastosSupermercado;
		}

		System.out.printf("%.2f%n", valorTotalDosGastosDaFamilia);
		scanner.close();
	}
}
