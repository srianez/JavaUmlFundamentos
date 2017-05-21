package Atividades03;

import java.util.Comparator;

public class Comparador implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa, Pessoa pessoa2) {
		return pessoa.getNome().compareTo(pessoa2.getNome());
	}

}