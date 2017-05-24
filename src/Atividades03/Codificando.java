package Atividades03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Codificando {

	public static void main(String[] args) {

		String texto;
		char caracter;

		System.out.println("Início da geração do arquivo codificado.");
		
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

				caracter = texto.charAt(i);  // pega cada posição digitada
				
				int codigo = (int) caracter; // pega o ascii da posição obtida anteriormente
				
				codigo += 1;                 //incrementa 1 no asc da letra recuperada
				
				tmp.append((char) codigo);   // concatena as strings no mesmo objeto

			}

			String txtCodificado = new String(tmp.toString());

			fw.write(txtCodificado);
			fw.flush();
			fw.close();
			input1.close();

			System.out.println("Arquivo codificado "+"mensagemCodificada.txt)"+" foi gerado!");
			
		} catch (IOException e) {
			System.err.printf("Erro na geração do arquivo: %s.\n", e.getMessage());
		}

	}

}
