package Atividades02;

public class Movel extends Equipamento implements EquipamentoEletronico {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void desligar() {
		System.out.println("Ligar");
	}

	public void ligar() {
		System.out.println("Desligar");
	}
}