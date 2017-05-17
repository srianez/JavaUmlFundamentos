package Atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calc {
	
    public int somar(int num1, int num2) {
        return num1 + num2;
    }
    
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }
    
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
    
    public int multiplicar(int num1, int num2) {
            return num1 * num2;
    }
    
    public static void main(String args[]) {
            
            Calc x = new Calc();
            
            int  opcao;
            int  num1;
            int  num2;
            
            Scanner input = new Scanner(System.in);
            System.out.println("Escolha a opera��o desejada:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
           
            opcao = input.nextInt();
          
            if ( (opcao <1) || (opcao >4) ){            	
            	System.out.println("Op��o inv�lida");
            	return;				
			};
           
                Scanner input1 = new Scanner(System.in);
                System.out.println("Informe o primeiro n�mero: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo n�mero: ");
                num2 = input1.nextInt();
                
                if (opcao == 1) {
                    int operacao = x.somar(num1, num2);
                    System.out.printf("\nO resultado da soma �: %2f\n", operacao);
                } else if (opcao == 2) {
                	int operacao = x.subtrair(num1, num2);
                    System.out.printf("\nO resultado da subtra��o �: %d\n", operacao);
                } else if (opcao == 3) {
                	int operacao = x.multiplicar(num1, num2);
                    System.out.printf("\nO resultado da multiplica��o �: %d\n", operacao);
                } else if (opcao == 4) {
                	int operacao = x.dividir(num1, num2);
                    System.out.printf("\nO resultado da divis�o �: %d\n", operacao);
                }
            
        } 
}