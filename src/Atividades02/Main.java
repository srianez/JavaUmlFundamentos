package Atividades02;

import java.util.Arrays;
import java.util.Objects;

import javax.swing.JList;
import javax.swing.JOptionPane;

import Atividades02.ImplCalculadora;

public class Main {

	public static void main(String[] args) {

		// Ex 1 e 4
		
		float v1;
		float v2;

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
		
		
//		EquipamentoEletronico tablet = new Tablet();
//		
//		EquipamentoEletronico smartphone = new Smartphone();
//		
//		Equipamento equipamento = new Equipamento();
//		
//		Object objeto = new Object();
//		
//		Movel movel = new Movel();
//		
//		Tablet tablet2 = new Tablet();
//		
//		Smartphone smartphone2 = new Smartphone();
//		
//		objeto = equipamento;
//		objeto = movel;
//		
//		tablet2.setModelo("AIFONE eiti");
//		tablet2.setFabricante("maça");
//		
//		smartphone2.setModelo("Grande");
//		System.out.println("tablet"+tablet2.getModelo());
//		
//		equipamento = tablet2;
//		System.out.println("equipamento tablet2 " + equipamento.getModelo());
//		
//		equipamento = smartphone2;
//		System.out.println("equipamento smartphone2 " + equipamento.getModelo());
//		
//		equipamento = smartphone2;
//		
//		smartphone = tablet;
//		tablet = (EquipamentoEletronico) equipamento; 
		
		//===================================================

	    ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: "+valor);
		
		//===================================================

		Cachorro cachorro = new Cachorro();
		Boolean valor2 = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: "+valor2);
			

	}
}