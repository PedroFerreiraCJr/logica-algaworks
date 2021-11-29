package br.com.algaworks.curso_logica._4_operadores;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Menu de opções de operações: ");
		System.out.println(" 1 - Adição");
		System.out.println(" 2 - Subtração");
		System.out.println(" 3 - Multiplicação");
		System.out.println(" 4 - Divisão");
		System.out.print("Digite a operação: ");
		int operacao = scanner.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		int valor2 = scanner.nextInt();
		
		long resultado = 0;
		if (operacao == 1) {
			resultado = valor1 + valor2;
			System.out.println("Operação selecionado foi Adição");
		}
		
		if (operacao == 2) {
			resultado = valor1 - valor2;
			System.out.println("Operação selecionado foi Subtração");
		}
		
		if (operacao == 3) {
			resultado = valor1 * valor2;
			System.out.println("Operação selecionado foi Multiplicação");
		}
		
		if (operacao == 4) {
			resultado = valor1 / valor2;
			System.out.println("Operação selecionado foi Divisão");
		}
		
		System.out.printf("O resultado da operação é: %d%n", resultado);
		
		scanner.close();
	}
}
