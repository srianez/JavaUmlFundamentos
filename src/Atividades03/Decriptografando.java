package Atividades03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Decriptografando {

	public static void main(String[] args) {
		//Scanner ler = new Scanner(System.in);

		//System.out.printf("Informe o nome de arquivo texto:\n");
		char caracter;
		String nome = "mensagemCodificada.txt"; //ler.nextLine();
		StringBuilder x;
		StringBuilder tmp = new StringBuilder();
		boolean newArquivo = false;
		
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			
			for (int i = 0; i < linha.length(); i++) {
				
				caracter = linha.charAt(i);
				
				int codigo 	  = (int) caracter; //pega o ascii da posição obtida

				//System.out.println("ASC original: "+ codigo);
				
				codigo -= 1;
				
				//System.out.println("ASC subtraido: "+ codigo);	
				
				//System.out.println("Caractere criptografado: " + (char) codigo);
						
				x = tmp.append((char) codigo); //gera a linha com o conteúdo trocado
				
				
			}
			
			String textao = new String(tmp.toString());
			
			//System.out.println(textao);
			
			arq.close();
			
			
			File f = new File("mensagemDecodificada.txt");
			newArquivo = f.createNewFile();
			FileWriter fw = new FileWriter(f);			
			fw.write(textao);
			fw.flush();
			fw.close();
		
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

	}
}