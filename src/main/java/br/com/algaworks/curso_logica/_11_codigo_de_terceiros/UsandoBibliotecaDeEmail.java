package br.com.algaworks.curso_logica._11_codigo_de_terceiros;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		String assunto = "Aula sobre uso de biblioteca de terceiros";
		String msg = "Se estiver vendo este e-mail, é porque o envio de e-mail funcionou!";
		String destino = "pedroferreiracjr@gmail.com";

		Carteiro.enviar(destino, assunto, msg);
	}
}
