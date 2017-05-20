package Aula1705;

import java.time.LocalDateTime;
import java.util.Date;

public class Clientes {
	
	private String nome;
	private int idade;
	private boolean ativo;
	private LocalDateTime dtcompra;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDateTime getDtcompra() {
		return dtcompra;
	}
	public void setDtcompra(LocalDateTime dtcompra) {
		this.dtcompra = dtcompra;
	}

}
