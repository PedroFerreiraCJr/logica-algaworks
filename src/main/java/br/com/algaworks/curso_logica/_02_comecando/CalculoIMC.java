package br.com.algaworks.curso_logica._02_comecando;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();

		System.out.print("Digite a altura: ");
		Double altura = scanner.nextDouble();

		Double imc = peso / (altura * altura);

		System.out.println("O IMC para os valores de peso e altura informados é: " + imc);

		scanner.close();
	}
}
