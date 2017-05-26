package simuladorAeroporto;

import java.util.Date;

//As classes Aeroporto e Aviao dever�o herdar a classe Thread.
public class Aviao extends Thread {

	private String nomeVoo;
	private Aeroporto aeroportoChegada;
	private Aeroporto aeroportoSaida;

	// Dever� receber no construtor o nome do voo e o objeto da classe Aeroporto
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

	// Dever� possuir os m�todos decolar, voar e aterrissar.

	public void voar() {
		try {
			// No m�todo voar, coloque uma espera de 2 segundos.

			System.out.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo + " iniciando v�o");
			sleep(2000);
			System.out
					.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo + " finalizando v�o");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void decolar() {
		System.out.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo
				+ " aguardando permiss�o para decolar no aeroporto " + aeroportoSaida.getNomeAeroporto() + ".");
		// No m�todo decolar e aterrissar dever� verificar se na classe
		// Aeroporto possui
		// pista dispon�vel por meio do m�todo aguardarPistaDisponivel

		aeroportoSaida.aguardarPistaDisponivel();

		System.out.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo
				+ " recebeu permiss�o para decolar no aeroporto " + aeroportoSaida.getNomeAeroporto() + ".");

	}

	public void aterrissar() {

		System.out.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo
				+ " aguardando permiss�o para aterrissar no aeroporto " + aeroportoChegada.getNomeAeroporto() + ".");

		aeroportoChegada.aguardarPistaDisponivel();

		System.out.println("AVI�O " + Util.horaFormatada(new Date()) + ": V�o " + this.nomeVoo
				+ " recebeu permiss�o para aterrissar no aeroporto " + aeroportoChegada.getNomeAeroporto() + ".");
	}
}
