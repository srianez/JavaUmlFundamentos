package Atividades04;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Cores[] cor = Cores.values();
		Cores c;
		
		for (int i = 0; i < cor.length; i++) {
			c = cor[i]; 
			System.out.println(c.getNome()+ " " + c.getCodigo());		
		}
		
		System.out.println("======================");
		System.out.println(Cores.BRANCO.getNome() +" "+ Cores.BRANCO.getCodigo());
		System.out.println("======================");
		
		System.out.println("========= PROCESSAMENTO DAS THREADS =========");
	

		Thread1 x = new Thread1();
		Thread2 y = new Thread2();

		Thread thread1 = new Thread(x);
		Thread thread2 = new Thread(y);

		thread1.start();
		thread2.start();

		while (1 == 1) {

			if (thread1.isAlive()) {
				System.out.println("Thread1 em execução");
			} else if (thread1.interrupted()) {
				System.out.println("Thread1 interrompida.");
			}

			if (thread2.isAlive()) {
				System.out.println("Thread2 em execução");
			} else if (thread2.interrupted()) {
				System.out.println("Thread2 interrompida.");
			}
			
			Thread.sleep(5000);
			
		}

	}

}
