package br.com.algaworks.curso_logica._03_variaveis_e_constantes;

public class TipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);

		Boolean variavelFalsa = false;
		System.out.println("Variável falsidade: " + variavelFalsa);

		System.out.println("-------------------------------------------");

		Integer idade = 20;
		Boolean habilitadoParaCarteira = idade >= 18;
//		System.out.println("Habilitado para tirar carteira: " + habilitadoParaCarteira);
		if (habilitadoParaCarteira) {
			System.out.println("Sim! Ele(a) está habilitado a tirar carteira");
		}
		else {
			System.out.println("Não. Ele(a) não está habilitado a tirar carteira");
		}
	}
}
