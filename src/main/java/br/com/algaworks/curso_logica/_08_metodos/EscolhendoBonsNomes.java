package br.com.algaworks.curso_logica._08_metodos;

import java.util.Scanner;

public class EscolhendoBonsNomes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		imprimirTraco();
		String cursoEscolhido = receberCursoDoUsuario(scanner);

		imprimirTraco();
		String formaPagamentoEscolhida = receberFormaPagamentoDoUsuario(scanner);

		imprimirTraco();
		System.out.printf("O curso escolhido foi %s, e a forma de pagamento é %s%n", cursoEscolhido,
				formaPagamentoEscolhida);
		scanner.close();
	}

	static void imprimir(String texto) {
		System.out.println(texto);
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

	static void iterarEExibirPosicoesDoVetorString(String[] array) {
		iterarEExibirPosicoesDoVetorString(array, 0);
	}

	static void iterarEExibirPosicoesDoVetorString(String[] array, Integer i) {
		System.out.printf("[%d] %s%n", i, array[i]);

		if (++i < array.length) {
			iterarEExibirPosicoesDoVetorString(array, i);
		}
	}

	static boolean posicaoInformadaEhValida(Integer posicao, String[] array) {
		return posicao >= 0 && posicao < array.length;
	}

	static Integer receberIndiceValidoDoUsuario(String[] vetor, String texto, Scanner scanner) {
		Integer posicaoEscolhida = prompt(scanner, "Qual é o curso que você deseja?: ");

		Boolean posicaoCursoValida = posicaoInformadaEhValida(posicaoEscolhida, vetor);
		if (!posicaoCursoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		return posicaoEscolhida;
	}

	static String receberCursoDoUsuario(Scanner scanner) {
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };
		imprimir("Escolha um dos cursos abaixo: ");
		iterarEExibirPosicoesDoVetorString(cursos);
		Integer posicaoCursoEscolhida = receberIndiceValidoDoUsuario(cursos, "Qual é o curso que você deseja?: ",
				scanner);
		return cursos[posicaoCursoEscolhida];
	}

	static String receberFormaPagamentoDoUsuario(Scanner scanner) {
		String[] formasPagamento = new String[] { "Cartão", "Boleto" };
		imprimir("Escolha um das formas de pagamento abaixo: ");
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		Integer posicaoFormaPagamentoEscolhida = receberIndiceValidoDoUsuario(formasPagamento,
				"Qual a forma de pagamento que você deseja?: ", scanner);
		return formasPagamento[posicaoFormaPagamentoEscolhida];
	}
}
