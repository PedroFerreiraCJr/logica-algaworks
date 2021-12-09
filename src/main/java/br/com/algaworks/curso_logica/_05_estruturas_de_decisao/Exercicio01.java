package br.com.algaworks.curso_logica._05_estruturas_de_decisao;

import java.util.Scanner;

public class Exercicio01 {
	
	private static final double NOTA_MINIMA_POR_MATERIA = 60d;
	private static final double NOTA_MINIMA_TOTAL = 150d;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota da prova de Português: ");
		double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota da prova de Matemática: ");
		double notaMatematica = scanner.nextDouble();
		
		double notaTotal = notaPortugues + notaMatematica;
		boolean candidatoPossuiRequisitosMinimosDeAprovacao = notaPortugues >= NOTA_MINIMA_POR_MATERIA
				&& notaMatematica >= NOTA_MINIMA_POR_MATERIA
				&& notaTotal >= NOTA_MINIMA_TOTAL;
		if (candidatoPossuiRequisitosMinimosDeAprovacao) {
			System.out.println("O candidato foi aprovado no concurso público, parabéns.");
		}
		else {
			System.out.println("O candidato não foi aprovado no concurso público.");
		}
		
		scanner.close();
	}
}
