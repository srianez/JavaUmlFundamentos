package Atividades04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Thread2 implements Runnable{

	public void run(){
		
		LocalDateTime data;
		
		while (1==1) {
			// Pause por 10 segundos
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data = LocalDateTime.now();
			System.out.println(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm:ss")));
			
		}
		
	}

}