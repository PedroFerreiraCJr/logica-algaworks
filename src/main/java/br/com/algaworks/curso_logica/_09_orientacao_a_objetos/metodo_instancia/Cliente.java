package br.com.algaworks.curso_logica._09_orientacao_a_objetos.metodo_instancia;

/***
 * 
 * Essa classe é uma abstração de cliente, ou seja, uma representação de um
 * objeto do mundo real que será usado pelo programa.
 * 
 * @author Pedro Júnior
 */
public class Cliente {
//	Essa é uma forma de inicializar as variáveis de instância do objeto que está sendo criado
//	String primeiroNome = "Alexandre";
//	String ultimoNome = "Afonso";

	String primeiroNome; // variável de instância, pois não foi declarada com static
	String ultimoNome; // variável de instância, pois não foi declarada com static
	String telefone; // variável de instância, pois não foi declarada com static
	String email; // variável de instância, pois não foi declarada com static

	/**
	 * Este método tem por objetivo retornar o nome completo da instância corrente
	 * de cliente. Este é um método de instância, pois não é declarado com a palavra
	 * reservada <strong>static</strong> em sua assinatura.
	 */
	String obterNomeCompletoCliente() {
		String nomeCompleto = this.primeiroNome + " " + this.ultimoNome; // A palavra reservada this referencia o
																			// próprio objeto
		return nomeCompleto;
	}

	/**
	 * Este método tem por objetivo retornar o ddd do telefone informado no cadastro
	 * do cliente.
	 */
	String obterDDD() {
		String ddd = this.telefone.substring(0, 2);
		return ddd;
	}
}
