package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer idade = 20;
//		final Integer idadeMinimaParaTirarCarteira = 18;

		Boolean habilitadoParaCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		if (habilitadoParaCarteira) {
			System.out.println("Sim! Ele(a) está habilitado a tirar carteira");
		}
		else {
			System.out.println("Não. Ele(a) não está habilitado a tirar carteira");
		}
		scanner.close();
	}
}
