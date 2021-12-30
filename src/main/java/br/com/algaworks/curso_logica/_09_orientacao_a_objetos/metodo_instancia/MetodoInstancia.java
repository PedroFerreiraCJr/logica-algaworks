package br.com.algaworks.curso_logica._09_orientacao_a_objetos.metodo_instancia;

public class MetodoInstancia {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "34000000";
		cliente.email = "alexandre.afonso@algaworks.com";

		// como os dados estão dentro do próprio objeto, é interessante se ele souber
		// executar essa operação. assim, seria interessante criar um método de
		// instância.
//		System.out.println("Nome cliente: " + cliente.primeiroNome + " " + cliente.ultimoNome);

		// outra forma seria criar um método estático, que engloba o comportamento
		// desejado, que é retornar o nome completo do cliente.
//		System.out.println("Nome cliente: " + obterNomeCompletoCliente(cliente));

		// agora usando um método de instância declarado na classe Cliente.
		// essa é a forma mais correta de modelar a interface da classe Cliente.
		System.out.println("Nome cliente: " + cliente.obterNomeCompletoCliente());
		System.out.println("DDD do cliente: " + cliente.obterDDD());
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "34999999";
		
		System.out.println("Nome cliente: " + cliente2.obterNomeCompletoCliente());
		System.out.println("DDD do cliente: " + cliente2.obterDDD());
	}

	/**
	 * Esse é um método estático que recebe o cliente e retorna o nome completo do
	 * cliente.
	 */
	static String obterNomeCompletoCliente(Cliente cliente) {
		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
		return nomeCompleto;
	}
}
