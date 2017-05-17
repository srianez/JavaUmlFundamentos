package Atividades;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		float v1;
		float v2;
		
		//Fatorial x = new Fatorial(8);
		//Atividade1Ex3 y = new Atividade1Ex3();
		
		v1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o primeiro valor"));
		v2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o segundo valor"));
		
		ImplCalculadora j = new ImplCalculadora();
		
        System.out.println(j.somar(v1, v2));	
       
	}

}