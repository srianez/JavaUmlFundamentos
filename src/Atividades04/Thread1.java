package Atividades04;

import java.util.ArrayList;

public class Thread1 implements Runnable{

	public void run(){
		
		boolean x = true;
		
		ArrayList<String> msg = new ArrayList<String>();
		
		msg.add("Ol�, boa noite, como vai?");
		msg.add("Qual o nome do seu animal?");
		msg.add("Eita thread demorada.");
		msg.add("L� vem o Marcos.");
		msg.add("Descendo o morro da v� Salvelina.");
		msg.add("Taca-lhe pau nesse carrinho, Marcos!.");
		msg.add("Abobrinha, bananas, xpto");		
		
		try{
			for (int i=1; i< msg.size(); i++){
				Thread.sleep(20000);
				System.out.println(msg.get(i));
			}
			System.out.println("T�rmino processamento Thread lista mensagens");
		}
		catch (Exception e){
			
		}
		
	}

}