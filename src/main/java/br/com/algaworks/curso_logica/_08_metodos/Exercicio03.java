package br.com.algaworks.curso_logica._08_metodos;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		imprimirTraco();
		final Double a = lerNumeroDoUsuario("Digite o primeiro valor: ", scanner);
		final Double b = lerNumeroDoUsuario("Digite o segundo valor: ", scanner);
		imprimirTraco();
		System.out.println();

		imprimirTraco();
		System.out.println("Opções de operação");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println();
		Integer op = lerOperacaoDoUsuario("Qual a operação desejada?", scanner);
		imprimirTraco();

		Double resultado = executarOperacao(op, a, b);
		System.out.println();
		System.out.printf("O resultado da operação é: %.2f", resultado);
		scanner.close();
	}

	static Double executarOperacao(Integer operacao, Double a, Double b) {
		Double resultado = null;
		switch (operacao.intValue()) {
			case 1: {
				resultado = somar(a, b);
				break;
			}
			case 2: {
				resultado = subtrair(a, b);
				break;
			}
			default: {
				System.err.println("Operação inválida!");
				System.exit(1);
			}
		}

		return resultado;
	}

	static void imprimirTraco() {
		System.out.println("*****------------------------------------------*****");
	}

	static Double lerNumeroDoUsuario(String texto, Scanner scanner) {
		System.out.print(texto);
		Double numero = Double.valueOf(scanner.nextLine());
		return numero;
	}

	static Integer lerOperacaoDoUsuario(String texto, Scanner scanner) {
		System.out.print(texto);
		Integer operacao = Integer.valueOf(scanner.nextLine());
		return operacao;
	}

	static Double somar(Double operando1, Double operando2) {
		return operando1 + operando2;
	}

	static Double subtrair(Double operando1, Double operando2) {
		return operando1 - operando2;
	}
}
