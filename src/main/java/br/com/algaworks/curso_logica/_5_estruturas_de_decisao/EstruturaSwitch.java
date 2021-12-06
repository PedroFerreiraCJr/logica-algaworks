package br.com.algaworks.curso_logica._5_estruturas_de_decisao;

import java.util.Scanner;

public class EstruturaSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o mês: ");
		Integer mes = scanner.nextInt();
		
		Double desconto = 0d;
		
		switch(mes) {
			case 1:
				desconto = 0d;
				break;
			case 2:
				desconto = 0d;
				break;
			case 3:
				desconto = 15d;
				break;
			case 4:
				desconto = 30d;
				break;
			case 5:
				desconto = 30d;
				break;
			case 6:
				desconto = 10d;
				break;
			case 7:
				desconto = 10d;
				break;
			case 8:
				desconto = 10d;
				break;
			case 9:
				desconto = 10d;
				break;
			case 10:
				desconto = 20d;
				break;
			case 11:
				desconto = 10d;
				break;
			case 12:
				desconto = 0d;
				break;
			default:
				System.err.println("Digite um mês válido");
				System.exit(1);
		}
		
		System.out.printf("Seu desconto será de: %.2f%", desconto);
		
		scanner.close();
	}
}
