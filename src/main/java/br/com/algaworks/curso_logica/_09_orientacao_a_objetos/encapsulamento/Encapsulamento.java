package br.com.algaworks.curso_logica._09_orientacao_a_objetos.encapsulamento;

public class Encapsulamento {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Alexandre Afonso");
		cliente.setTelefone("34922334455");

		/**
		 * Essa forma de acessar os atributos da classe, de forma direta, torna o
		 * cliente desta classe mais acoplado, fazendo com que, caso a implementação
		 * tenha que ser mudada, ela teria que ser refatorada em todos os locais que
		 * fazem acesso direto a esse atributo. Outro aspecto é que muitas vezes é
		 * preciso esconder os dados de acesso indevido do cliente da aplicação, para
		 * que não seja informado valores inválidos para o atributo da classe. Para isso
		 * que serve o encapsulamento dos atributos da classe.
		 */
		System.out.println("Nome do cliente: " + cliente.getNome());

		System.out.println("Sobrenome do cliente: " + cliente.getUltimoNome());
		System.out.println("Nome Completo do cliente: " + cliente.getNomeCompleto());
	}
}
