package simuladorAeroporto;

public class Main {

	public static void main(String[] args) {

		/*
		 * Crie uma classe Main para simular o comportamento das threads. Para
		 * isso, crie 3 objetos da classe Aviao para simular os voos: “TAN 123”,
		 * “OLÉ 111” e “LINHA 222” e analise o comportamento deles no aeroporto
		 * de acordo com o estado da pista.
		 */

		Aeroporto aeroportoChegada = new Aeroporto("Aeroporto B");
		Aeroporto aeroportoSaida = new Aeroporto("Aeroporto A");
		Aviao aviao1 = new Aviao("TAN 1", aeroportoSaida, aeroportoChegada);
		Aviao aviao2 = new Aviao("OLÉ 2", aeroportoSaida, aeroportoChegada);
		Aviao aviao3 = new Aviao("LINHA 3", aeroportoSaida, aeroportoChegada);
		Aviao aviao4 = new Aviao("LINHA 4", aeroportoSaida, aeroportoChegada);
		Aviao aviao5 = new Aviao("LINHA 5", aeroportoSaida, aeroportoChegada);
		aeroportoSaida.start();
		aeroportoChegada.start();
		aviao1.start();
		aviao2.start();
		aviao3.start();
		aviao4.start();
		aviao5.start();

		try {
			aviao1.join();
			aviao2.join();
			aviao3.join();
			aviao4.join();
			aviao5.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Todos os avisões encerraram as aterrissagens.");

		// encerrar aeroportos


	}
}
