package br.com.algaworks.curso_logica._09_orientacao_a_objetos.encapsulamento;

import java.util.UUID;

public class Exercicio03 {
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCódigo(UUID.randomUUID().toString());
		pedido.setSubtotal(100.0d);
		pedido.setDesconto(20.0d);

		System.out.println("Código do Pedido: " + pedido.getCódigo());
		System.out.println("Subtotal do Pedido: " + pedido.getSubtotal());
		System.out.println("Desconto do Pedido: " + pedido.getDesconto());
		System.out.println("Total do Pedido: " + pedido.getTotal());
	}
}
