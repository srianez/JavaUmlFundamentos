package Atividades03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;


public class Exercicio4 {

	public static void main(String[] args) {

		ArrayList<Pessoa> listaPessoa = new ArrayList<Pessoa>();

		listaPessoa.add(new Pessoa("Silas", 30, "M", "Techne"));
		listaPessoa.add(new Pessoa("Pedro", 68, "M", "Fiap"));
		listaPessoa.add(new Pessoa("Amaury", 55, "M", "Techne"));
		listaPessoa.add(new Pessoa("Gilberto", 12, "M", "Techne"));
		listaPessoa.add(new Pessoa("Maria", 21, "F", "IBM"));

		//Sorteando a lista e removendo uma pessoa aleatória
		Random sorteio = new Random();

		for (int contagem = 1; contagem <= listaPessoa.size(); contagem++) {
			Pessoa i = listaPessoa.get(sorteio.nextInt(listaPessoa.size()));

			listaPessoa.remove(i);
			break;
		}
		
		//Ordenando a lista baseada no nome
		Iterator<Pessoa> iterador = listaPessoa.iterator();
	
		Comparador comparador = new Comparador();
		Collections.sort(listaPessoa, comparador);
		iterador = listaPessoa.iterator();

		System.out.println("Lista ordenada pelo Nome e removendo um elemento aleatório");
		while (iterador.hasNext()) {
			Pessoa pessoa = iterador.next();
			System.out.println("Nome: " + pessoa.getNome());
		}
		
		//orderna a lista de forma invertida
		Collections.reverse(listaPessoa);
		
		System.out.println("Ordenação inversa :" + listaPessoa.toString());
		
	}
}
