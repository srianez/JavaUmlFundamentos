package Aula1705;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


	public static void main(String[] args) {
        
		LocalDateTime inicio = LocalDateTime.now();
		inicio = LocalDateTime.now();
		
		LinkedList<Integer> x = new LinkedList<>();
		ArrayList<Integer> j = new ArrayList<>();
		
		for (int i = 0; i <= 10000; i++) {
			x.add(i);
		}
	
		LocalDateTime fim = LocalDateTime.now();
		fim = LocalDateTime.now();
		System.out.println("Tempo inserção LinkedList: "+ ChronoUnit.MILLIS.between(inicio, fim));
		
		
		inicio = LocalDateTime.now();
		for (int i = 0; i <= 5000; i++) {
			j.add(i);
		}
		
		fim = LocalDateTime.now();
		System.out.println("Tempo inserção ArrayList: "+ ChronoUnit.MILLIS.between(inicio, fim));

	}
	
}
