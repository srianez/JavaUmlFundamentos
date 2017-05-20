package Atividades03;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListvsLinkedList {

	public ArrayListvsLinkedList(){//static void main(String[] args) {
		
		Integer aux;
		boolean aux2;
		
		System.out.println(" ** Atividade 3: ArrayList vs LinkedList ** ");
		System.out.println("Processamento Arraylist:");
		
		ArrayList<Integer> valor1 = new ArrayList<Integer>();

		Instant inicioArrayList = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			valor1.add(i);
		}

		aux = valor1.get(500000);
		
		Instant fimArrayList = Instant.now();

		Duration duracao = Duration.between(inicioArrayList, fimArrayList);
		
		long duracaoArrayList = duracao.toMillis();

		System.out.println("   Término processamento Arraylist. Tempo em milissegundos: " + duracaoArrayList);

		System.out.println("Processamento LinkedList:");
		
		LinkedList<Integer> valor2 = new LinkedList<Integer>();

		Instant inicioLinkedList = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			valor2.add(i);
		}
		
		aux = valor2.get(500000);
		
		Instant fimLinkedList = Instant.now();

		duracao = Duration.between(inicioLinkedList, fimLinkedList);
		
		long duracaoLinkedList = duracao.toMillis();

		System.out.println("   Término processamento LinkedList. Tempo em milissegundos: " + duracaoLinkedList);
		System.out.println(" ");
		
		if (duracaoArrayList > duracaoLinkedList) {
			System.out.println("Entre ArrayList e LinkedList o melhor desempenho foi do LinkedList");
		} else if (duracaoArrayList < duracaoLinkedList) {
			System.out.println("Entre ArrayList e LinkedList o melhor desempenho foi do ArrayList");
		} else {
			System.out.println("As coleções tiveram o mesmo desempenho");
		}

	}

}
