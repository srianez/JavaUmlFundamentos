package Atividades;

import java.util.Arrays;
import java.util.Objects;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		float v1;
		float v2;

		// Fatorial x = new Fatorial(8);
		// Atividade1Ex3 y = new Atividade1Ex3();

		String[] operacao = { "Somar", "Subtrair", "Dividir", "Multiplicar" };

		String input = (String) JOptionPane.showInputDialog(null, "", "Escolha uma operação",
				JOptionPane.QUESTION_MESSAGE, null, operacao, operacao[0]);

		if (Objects.isNull(input)) {
			System.out.println("Cancelado!");
			return;
		}

		try {

			v1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o primeiro valor"));
			v2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o segundo valor"));
		}

		catch (NumberFormatException nfe) {
			throw new NumberFormatException("O número informado é inválido");
		}

		ImplCalculadora j = new ImplCalculadora();

		if (Objects.equals(input, new String("Somar"))) {
			System.out.println(j.somar(v1, v2));
		}

		else if (Objects.equals(input, new String("Subtrair"))) {
			System.out.println(j.subtrair(v1, v2));
		}

		else if (Objects.equals(input, new String("Dividir"))) {
			System.out.println(j.dividir(v1, v2));
		} 
		
		else if (Objects.equals(input, new String("Multiplicar"))) {
			System.out.println(j.multiplicar(v1, v2));
		}

	}
}