package br.com.algaworks.curso_logica._04_operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Boolean periodoPromocao = true;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;

//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao;
//		if (aplicarDesconto) {
//			System.out.println("O desconto será aplicado");
//		}
//		else {
//			System.out.println("O desconto não será aplicado na compra");
//		}

//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoPromocao;
//		if (aplicarDesconto) {
//			System.out.println("O desconto será aplicado");
//		}
//		else {
//			System.out.println("O desconto não será aplicado na compra");
//		}
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao && jaFezCompraNaLoja
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoPromocao || jaFezCompraNaLoja;
		
//		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoPromocao || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = carrinhoMaiorQue100 && (periodoPromocao || jaFezCompraNaLoja) && pagamentoAVista;
		if (aplicarDesconto) {
			System.out.println("O desconto será aplicado");
		}
		else {
			System.out.println("O desconto não será aplicado na compra");
		}
	}
}
