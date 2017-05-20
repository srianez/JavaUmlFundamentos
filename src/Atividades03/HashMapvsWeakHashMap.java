package Atividades03;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class HashMapvsWeakHashMap {
	
	public HashMapvsWeakHashMap() {

		String aux;
		
		System.out.println(" ** Atividade 3: HashMap vs WeakHashMap ** ");

		System.out.println("Processamento Hashmap:");

		Map<Integer, String> x = new HashMap<>();
		
		Instant inicioHashMap = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			x.put(i, Integer.toString(i));
		}
		
		aux = x.get(500000);

		Instant fimHashMap = Instant.now();

		Duration duracao = Duration.between(inicioHashMap, fimHashMap);
		
		long duracaoHashMap = duracao.toMillis();

		System.out.println("   Término processamento HashMap. Tempo em milissegundos: " + duracaoHashMap);

		System.out.println("Processamento WeakHashMap:");

		Map<Integer, String> y = new WeakHashMap<Integer, String>();

		Instant inicioWeakHashMap = Instant.now();

		for (int i = 0; i <= 1000000; i++) {
			y.put(i, Integer.toString(i));
		}

		aux = y.get(500000);
		
		Instant fimWeakHashMap = Instant.now();

		duracao = Duration.between(inicioWeakHashMap, fimWeakHashMap);
		
		long duracaoHWeakHashMap = duracao.toMillis();

		System.out.println("   Término processamento HashSet. Tempo em milissegundos: " + duracaoHWeakHashMap);
		System.out.println(" ");
		
		if (duracaoHashMap > duracaoHWeakHashMap) {
			System.out.println("Entre HashMap e WeakHashMap o melhor desempenho foi do WeakHashMap");
		} else if (duracaoHashMap < duracaoHWeakHashMap) {
			System.out.println("Entre HashMap e WeakHashMap o melhor desempenho foi do HashMap");
		} else {
			System.out.println("As coleções tiveram o mesmo desempenho");
		}
		
	}

}
