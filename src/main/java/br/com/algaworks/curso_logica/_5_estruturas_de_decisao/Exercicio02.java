package br.com.algaworks.curso_logica._5_estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento anual da empresa: ");
		Double metaFaturamentoAnualDaEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o faturamento real da empresa: ");
		Double faturamentoRealDaEmpresa = scanner.nextDouble();
		
		System.out.print("Digite a média salarial do funcionário: ");
		Double mediaSalarialDoFuncionario = scanner.nextDouble();
		
		Boolean bateuAMetaAnual = faturamentoRealDaEmpresa >= metaFaturamentoAnualDaEmpresa;
		Double bonusFuncionario = null;
		if (bateuAMetaAnual) {
			bonusFuncionario = mediaSalarialDoFuncionario;
		}
		else {
			Double oitentaPorCentoDaMetaAnual = metaFaturamentoAnualDaEmpresa * 0.8;
			Boolean faturamentoRealEstaAcimaDeOitentaPorCento = faturamentoRealDaEmpresa >= oitentaPorCentoDaMetaAnual;
			if (faturamentoRealEstaAcimaDeOitentaPorCento) {
				bonusFuncionario = mediaSalarialDoFuncionario * 0.8;
			}
			else {
				System.out.println("Infelizmente, esse ano não tem bônus!");
			}
		}

		System.out.printf("O bonus do funcionário é de: %.2f", bonusFuncionario);
		
		scanner.close();
	}
}
