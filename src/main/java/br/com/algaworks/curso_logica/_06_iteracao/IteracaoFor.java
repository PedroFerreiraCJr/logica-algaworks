package br.com.algaworks.curso_logica._06_iteracao;

public class IteracaoFor {
	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i + ": Uma frase qualquer.");
//		}

//		Double[] carrinhoDeCompras = new Double[] { 50d, 50d, 50d };
//		Double total = 0d;
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.printf("Iteração: %d, Total: %.2f%n", i, total);
//			total += carrinhoDeCompras[i];
//		}
//		
//		System.out.printf("Total: %.2f", total);

//		usando a palavra reservada 'break' no for
//		for (int i=0;i<10;i++) {
//			if (i == 5) {
//				System.out.println("Vai parar!");
//				break;
//			}
//			
//			System.out.println("Iteração: " + i);
//		}

//		usando a palavra reservada 'continue' no for
//		for (int i=0;i<10;i++) {
//			if (i == 5) {
//				System.out.println("Vai pular para a próxima iteração!");
//				continue;
//			}
//			
//			System.out.println("Iteração: " + i);
//		}

		Integer[] produtos = new Integer[] { 100, 255, 300 };
		for (int i=0;i<produtos.length;i++) {
			final Integer produto = produtos[i];
			if (produto.equals(Integer.valueOf(255))) {
				System.out.println("Produto encotrado!");
				break;
			}
		}
	}
}
