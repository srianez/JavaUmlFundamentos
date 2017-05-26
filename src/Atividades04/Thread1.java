package Atividades04;

import java.util.ArrayList;

public class Thread1 implements Runnable{

	public void run(){
		
		boolean x = true;
		
		ArrayList<String> msg = new ArrayList<String>();
		
		msg.add("Olá, boa noite, como vai?");
		msg.add("Qual o nome do seu animal?");
		msg.add("Eita thread demorada.");
		msg.add("Lá vem o Marcos.");
		msg.add("Descendo o morro da vó Salvelina.");
		msg.add("Taca-lhe pau nesse carrinho, Marcos!.");
		msg.add("Abobrinha, bananas, xpto");		
		
		try{
			for (int i=1; i< msg.size(); i++){
				Thread.sleep(20000);
				System.out.println(msg.get(i));
			}
			System.out.println("Término processamento Thread lista mensagens");
		}
		catch (Exception e){
			
		}
		
	}

}