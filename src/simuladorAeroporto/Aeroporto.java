package simuladorAeroporto;


//As classes Aeroporto e Aviao dever�o herdar a classe Thread.
public class Aeroporto extends Thread {

	String nomeAeroporto;
	boolean temPistaDisponivel;

	// Dever� receber no construtor o nome do aeroporto.
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
			return " dispon�vel.";
		}
		return " indispon�vel.";
	}

	// Dever� ter um m�todo chamado aguardarPistaDisponivel onde verificar� a
	// disponibilidade da pista. Caso a pista esteja indispon�vel, dever�
	// aguardar at�
	// ficar dispon�vel.
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
	 * Dever� ter um m�todo chamado alterarEstadoPista que ser� respons�vel por
	 * alterar o estado da pista (verdadeiro/falso). A cada atualiza��o do
	 * estado da pista dever� notificar as threads desta condi��o para
	 * continuidade das opera��es (aterrissagem e decolagem).
	 */
	public void alterarEstadoPista() {

		// O estado da pisa dever� ser alterado a cada 3 segundos.
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
