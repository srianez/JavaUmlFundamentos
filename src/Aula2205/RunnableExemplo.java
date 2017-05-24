package Aula2205;

public class RunnableExemplo implements Runnable {
	
	public void run() {
		
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println( this);
		}
			
		}
}