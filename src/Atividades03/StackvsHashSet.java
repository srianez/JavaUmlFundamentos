package Atividades03;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StackvsHashSet {

	public StackvsHashSet() {
		
		Integer aux;
		Boolean aux2;
		
		System.out.println(" ** Atividade 3: Stack vs HashSet ** ");

		System.out.println("Processamento Stack:");

		Stack<Integer> vStackS = new Stack<Integer>();
		
		Instant inicioStacks = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			vStackS.push(i);
		}
		
		aux = vStackS.get(500000);

		Instant fimStacks = Instant.now();

		Duration duracao = Duration.between(inicioStacks, fimStacks);
		
		long duracaoStacks = duracao.toMillis();

		System.out.println("   Término processamento Stacks. Tempo em milissegundos: " + duracaoStacks);

		System.out.println("Processamento HashSet:");

		Set<Integer> vHashSet = new HashSet<Integer>();

		Instant inicioHashSet = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			vHashSet.add(i);
		}

		aux2 = vHashSet.contains(500000);

		Instant fimHashSet = Instant.now();

		duracao = Duration.between(inicioHashSet, fimHashSet);
		
		long duracaoStackHash = duracao.toMillis();

		System.out.println("   Término processamento HashSet. Tempo em milissegundos: " + duracaoStackHash);
		System.out.println(" ");
		
		if (duracaoStacks > duracaoStackHash) {
			System.out.println("Entre Stack e HashSet o melhor desempenho foi do HashSet");
		} else if (duracaoStacks < duracaoStackHash) {
			System.out.println("Entre Stack e HashSet o melhor desempenho foi do Stack");
		} else {
			System.out.println("As coleções tiveram o mesmo desempenho");
		}

	}

}
