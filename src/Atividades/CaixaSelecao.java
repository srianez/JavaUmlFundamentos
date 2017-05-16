package Atividades;

import javax.swing.JOptionPane;

public class CaixaSelecao {
	  public static void main(String[] args) {
	    Object[] opcoes = { "Somar", "Subtrair","Multiplicar","Dividir","Sair" };
	    Object resposta;
	    do {
	      resposta = JOptionPane.showInputDialog(null,
	                            "Escolha uma opção",
	                            "",
	                            JOptionPane.PLAIN_MESSAGE,
	                            null,
	                            opcoes,
	                            "Somar");
	    } while (resposta == null || resposta.equals("Sair"));
	  }
	}
