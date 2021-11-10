package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class TipoTexto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		System.out.println("Olá, " + nome + "!");
		scanner.close();
	}
}
