package Atividades03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Decodificando {

	public static void main(String[] args) {

		char caracter;
		String nome = "mensagemCodificada.txt"; // arquivo que será lido
		StringBuilder x;
		StringBuilder tmp = new StringBuilder();
		boolean newArquivo = false;

		System.out.println("Início da leitura do arquivo codificado.");
		
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine(); // lê a primeira linha

			for (int i = 0; i < linha.length(); i++) {

				caracter = linha.charAt(i); // pega a primeira posição

				int codigo = (int) caracter; // pega o ascii da posição obtida

				codigo -= 1;

				x = tmp.append((char) codigo);

			}
            
			System.out.println("Montando arquivo decodificado.");
			
			String txtDecodificado = new String(tmp.toString());

			arq.close();

			File f = new File("mensagemDecodificada.txt");  //gera o novo arquivo com o conteúdo decodificado
			newArquivo = f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write(txtDecodificado);
			fw.flush();
			fw.close();
			
			System.out.println("Arquivo "+"mensagemDecodificada.txt"+" gerado com sucesso");

		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

	}
}