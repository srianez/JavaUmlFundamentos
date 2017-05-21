package Atividades03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterMain {
      /**
       * @param args
       */
      public static void main(String[] args) {
    	  
    	         String texto;
                 StringBuilder texto2;
    	  
            try{
                  boolean newArquivo = false;
                  File f = new File("mensagemCodificada.txt");
                 
                  newArquivo = f.createNewFile();

                  FileWriter fw = new FileWriter(f);
                  
                  Scanner input1 = new Scanner(System.in);
                  System.out.println("Informe o texto: ");
                  texto = input1.nextLine();
                  
                  //StringBuilder tmp = new StringBuilder();
                  
                  //texto2 = tmp.append(texto);
                  
                  fw.write(texto);
                  fw.flush();
                  fw.close();
                  
            }catch (IOException e) {
            }
      }
}
