package br.com.algaworks.curso_logica._07_vetores;

public class VetoresMaisDe2Dimensoes {
	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] { 1500d, 2000d, 17000d };
		Double[] faturamentoFevereiro = new Double[] { 1000d, 2500d, 1800d };

		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };
		
		Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
		
		Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };
		

//		for (int i = 0; i < faturamentoAnual.length; i++) {
//			System.out.println("Mês: " + (i + 1));
//			Double[] mes = faturamentoAnual[i];
//			for (int j = 0; j < mes.length; j++) {
//				Double dia = mes[j];
//				Double dia = faturamentoAnual[i][j];
//				System.out.println("Dia "+ (j + 1) + ": " + dia);
//			}
//		}
	}
}
