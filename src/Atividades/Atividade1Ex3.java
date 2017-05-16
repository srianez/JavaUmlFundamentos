package Atividades;

import javax.swing.JOptionPane;

public class Atividade1Ex3 {


	public static void main(String args[])  {
		
		double[] salarios;
		double   vlrtotalSal = 0;
		
		//Armazena a quantidade de funcionários
		int   qtdfunc = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade de funcionários?"));
		
		salarios = new double[qtdfunc]; //define o tamanho do array
		
		for (int i = 0; i < qtdfunc; i++) {
			
			salarios[i] =  Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do " + (i+1) +" salário"));
			
		    vlrtotalSal += salarios[i];
		}
		
		System.out.println("Total salário: " + vlrtotalSal);
		System.out.println("Média salário: " + (vlrtotalSal / salarios.length));
	}
}
