package br.com.algaworks.curso_logica._08_metodos;

import java.util.Scanner;

public class RecebendoParametros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };
		System.out.println("Escolha um dos cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = prompt(scanner, "Qual é o curso que você deseja?: ");

		Boolean posicaoCursoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		if (!posicaoCursoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };
		System.out.println("Escolha um das formas de pagamento abaixo: ");
		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = prompt(scanner, "Qual a forma de pagamento que você deseja?: ");

		Boolean posicaoFormaPagamentoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		if (!posicaoFormaPagamentoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();
		System.out.printf("O curso escolhido foi %s, e a forma de pagamento é %s%n", cursoEscolhido,
				formaPagamentoEscolhida);
		scanner.close();
	}

	static void iterarEExibirPosicoesDoVetorString(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%d] %s%n", i, array[i]);
		}
	}

	static void imprimirTraco() {
		System.out.println("---------------------------------------------------");
	}
	
	static int prompt(Scanner scanner, String mensagem) {
		System.out.print(mensagem);
		return scanner.nextInt();
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
}
