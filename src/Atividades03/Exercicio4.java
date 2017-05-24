package Atividades03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio4 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String texto;

		try {
			boolean newArquivo = false;
			File f = new File("mensagemCodificada.txt");

			newArquivo = f.createNewFile();

			FileWriter fw = new FileWriter(f);

			Scanner input1 = new Scanner(System.in);
			System.out.println("Informe o texto: ");
			texto = input1.nextLine();

			StringBuilder tmp = new StringBuilder();
			
			for (char c : texto.toCharArray()) {
				tmp.append((int) c + 1);
				
			}

			BigInteger mInt = new BigInteger(tmp.toString());
			
			System.out.println(mInt);
			
			fw.write(mInt.toString());
			fw.flush();
			fw.close();
			input1.close();

		} catch (IOException e) {
		}
	}
}
