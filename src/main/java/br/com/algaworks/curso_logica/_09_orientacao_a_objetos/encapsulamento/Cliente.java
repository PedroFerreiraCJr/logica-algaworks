package br.com.algaworks.curso_logica._09_orientacao_a_objetos.encapsulamento;

public class Cliente {
	/**
	 * A simples utilização dos métodos declarados abaixo não torna o acesso
	 * restrito somente através dos métodos. Para restringir mais restrito possível,
	 * com acesso direto somente dentro da classe que declara o atributo é preciso
	 * usar a palavra reservada <strong>private</strong>, como no atributo
	 * <strong>nome</strong>.
	 */
	private String nome;

	/**
	 * O atributo telefone segue a mesma regra da atributo nome. Portanto, deve ter
	 * o acesso direto somente a classe onde está contido.
	 */
	private String telefone;

	private String primeiroNome;
	private String ultimoNome;

	/**
	 * Torna o acesso ao atributo possível.
	 */
	String getNome() {
		return this.nome;
	}

	/**
	 * Torna possível atribuir valores a variável de instância
	 * <strong>nome</strong>. Neste método, conhecido como Setter é possível validar
	 * os valores que estão sendo recebidos como parâmetro e atribuídos a variável
	 * de instância desta classe.
	 */
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		this.primeiroNome = nomeCompleto[0];
		this.ultimoNome = nomeCompleto[1];
		this.nome = this.primeiroNome;
	}

	String getTelefone() {
		return this.telefone;
	}

	void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	String getNomeCompleto() {
		return this.primeiroNome + " " + this.ultimoNome;
	}

	String getUltimoNome() {
		return this.ultimoNome;
	}
}
