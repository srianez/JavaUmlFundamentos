package simuladorAeroporto;

import java.util.Date;

//As classes Aeroporto e Aviao deverão herdar a classe Thread.
public class Aviao extends Thread {

	private String nomeVoo;
	private Aeroporto aeroportoChegada;
	private Aeroporto aeroportoSaida;

	// Deverá receber no construtor o nome do voo e o objeto da classe Aeroporto
	public Aviao(String nomeVoo, Aeroporto aeroportoSaida, Aeroporto aeroportoChegada) {
		this.nomeVoo = nomeVoo;
		this.aeroportoChegada = aeroportoChegada;
		this.aeroportoSaida = aeroportoSaida;

	}

	public void run() {
		try {

			this.decolar();
			this.voar();
			this.aterrissar();

		} catch (Throwable t) {
		}
	}

	// Deverá possuir os métodos decolar, voar e aterrissar.

	public void voar() {
		try {
			// No método voar, coloque uma espera de 2 segundos.

			System.out.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo + " iniciando vôo");
			sleep(2000);
			System.out
					.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo + " finalizando vôo");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void decolar() {
		System.out.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo
				+ " aguardando permissão para decolar no aeroporto " + aeroportoSaida.getNomeAeroporto() + ".");
		// No método decolar e aterrissar deverá verificar se na classe
		// Aeroporto possui
		// pista disponível por meio do método aguardarPistaDisponivel

		aeroportoSaida.aguardarPistaDisponivel();

		System.out.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo
				+ " recebeu permissão para decolar no aeroporto " + aeroportoSaida.getNomeAeroporto() + ".");

	}

	public void aterrissar() {

		System.out.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo
				+ " aguardando permissão para aterrissar no aeroporto " + aeroportoChegada.getNomeAeroporto() + ".");

		aeroportoChegada.aguardarPistaDisponivel();

		System.out.println("AVIÃO " + Util.horaFormatada(new Date()) + ": Vôo " + this.nomeVoo
				+ " recebeu permissão para aterrissar no aeroporto " + aeroportoChegada.getNomeAeroporto() + ".");
	}
}
