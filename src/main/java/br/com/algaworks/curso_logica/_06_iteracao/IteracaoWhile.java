package br.com.algaworks.curso_logica._06_iteracao;

public class IteracaoWhile {
	public static void main(String[] args) {
//		O laço 'for' geralmente é usado quando é conhecido a quantidade de vezes que deve ser feita a iteração
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Um texto qualquer");
//		}

//		o laço 'while' geralmente é para condições que são controladas por sentinela
//		int i = 0;
//		while (i < 10) {
//			System.out.println("Um texto qualquer");
//			i++;
//		}

//		int i = 0;
//		while (i < 10) {
//			if (i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			System.out.println(i + ": Um texto qualquer");
//			i++;
//		}
		
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				System.out.println("Vai pular para a próxima iteração!");
				i++;
				continue;
			}
			System.out.println(i + ": Um texto qualquer");
			i++;
		}
	}
}
