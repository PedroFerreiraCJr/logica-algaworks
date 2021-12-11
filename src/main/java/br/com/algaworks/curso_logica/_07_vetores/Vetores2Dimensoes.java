package br.com.algaworks.curso_logica._07_vetores;

public class Vetores2Dimensoes {
	public static void main(String[] args) {
		Double faturamentoDia = 1000.0;

		Double[] faturamentoJaneiro = new Double[] { 1500d, 2000d, 17000d };
		Double[] faturamentoFevereiro = new Double[] { 1000d, 2500d, 1800d };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };

//		System.out.println("faturamento do dia 1º de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("faturamento do dia 3º de Fevereiro: " + faturamentoAnual[1][2]);

		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			Double[] mes = faturamentoAnual[i];
			for (int j = 0; j < mes.length; j++) {
				Double dia = mes[j];
//				Double dia = faturamentoAnual[i][j];
				System.out.println("Dia "+ (j + 1) + ": " + dia);
			}
		}
	}
}
