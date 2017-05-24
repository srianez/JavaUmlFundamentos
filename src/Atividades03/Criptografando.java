package Atividades03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Criptografando {

	public static void main(String[] args) {
		
		String texto;
		StringBuilder x;
		char caracter;
		
		try {
			boolean newArquivo = false;
			File f = new File("mensagemCodificada.txt");
			newArquivo = f.createNewFile();
			FileWriter fw = new FileWriter(f);
		
			Scanner input1 = new Scanner(System.in);
			System.out.println("Informe o texto: ");
			texto = input1.nextLine();

			StringBuilder tmp = new StringBuilder();
		
		for (int i = 0; i < texto.length(); ++i) {
			
			caracter = texto.charAt(i); //obtem cada posição digitada
			int codigo 	  = (int) caracter; //pega o ascii da posição obtida

			//System.out.println("ASC original: "+ codigo);
			
			codigo += 1;
			
			//System.out.println("ASC original: "+ codigo);	
			
			//System.out.println("Caractere criptografado: " + (char) codigo);
					
			//x = tmp.append((char) codigo); //gera a linha com o conteúdo trocado
			tmp.append((char) codigo);
			//System.out.println(x);

		}
		
		   String textao = new String(tmp.toString());
				
		fw.write(textao);
		fw.flush();
		fw.close();
		input1.close();
		
	} catch (IOException e) {
	}		
		
	}

}
