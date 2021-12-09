package br.com.algaworks.curso_logica._05_estruturas_de_decisao;

public class EstruturaIf {
	public static void main(String[] args) {
		Double emprestimo = 4000d;
		Double movimentacaoMedia = 2000d;
		
//		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
//			&& aContaTemTempoSuficienteDeAbertura
//			&& temNomeLimpo;

		// É uma boa prática sempre facilitar a leitura da expressão criando variáveis com nomes descritivos
		//ou até mesmo métodos para essa finalidade
		if (((movimentacaoMedia * 2) >= emprestimo)
				&& aContaTemTempoSuficienteDeAbertura
				&& temNomeLimpo) {
			System.out.println("Sim, é possível liberar o empréstimo");
		}
		else {
			System.out.println("Não pode liberar o empréstimo");
		}
	}
}
