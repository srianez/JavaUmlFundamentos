package simuladorAeroporto;


//As classes Aeroporto e Aviao deverão herdar a classe Thread.
public class Aeroporto extends Thread {

	String nomeAeroporto;
	boolean temPistaDisponivel;

	// Deverá receber no construtor o nome do aeroporto.
	public Aeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
		this.temPistaDisponivel = false;
		// System.out.println("AEROPORTO " + Util.horaFormatada(new Date()) + ":
		// Pista do aeroporto "
		// + this.getNomeAeroporto() + statusAtualPista());

	}

	public String getNomeAeroporto() {
		return nomeAeroporto;
	}

	public void setNomeAeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}

	public void run() {
		try {

			while (true) {
				this.alterarEstadoPista();
			}

		} catch (Throwable t) {
		}
	}

	public String statusAtualPista() {
		if (this.temPistaDisponivel) {
			return " disponível.";
		}
		return " indisponível.";
	}

	// Deverá ter um método chamado aguardarPistaDisponivel onde verificará a
	// disponibilidade da pista. Caso a pista esteja indisponível, deverá
	// aguardar até
	// ficar disponível.
	public synchronized void aguardarPistaDisponivel() {

		System.out.println("tem  pista? " + temPistaDisponivel);
		
		if (!temPistaDisponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * Deverá ter um método chamado alterarEstadoPista que será responsável por
	 * alterar o estado da pista (verdadeiro/falso). A cada atualização do
	 * estado da pista deverá notificar as threads desta condição para
	 * continuidade das operações (aterrissagem e decolagem).
	 */
	public void alterarEstadoPista() {

		// O estado da pisa deverá ser alterado a cada 3 segundos.
		try {
			sleep(3000);
			// inverte o status
			this.temPistaDisponivel = !this.temPistaDisponivel;
			
			if(temPistaDisponivel)
				this.notify();
			
			// System.out.println("AEROPORTO " + Util.horaFormatada(new Date())
			// + ": Pista do aeroporto " + this.getNomeAeroporto() +
			// statusAtualPista());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
