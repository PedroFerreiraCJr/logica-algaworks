package br.com.algaworks.curso_logica._09_orientacao_a_objetos.encapsulamento;

public class Pedido {

	private String código;
	private Double subtotal;
	private Double desconto;

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return this.subtotal - this.desconto;
	}
}
