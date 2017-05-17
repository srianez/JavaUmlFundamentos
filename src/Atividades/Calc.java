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
            System.out.println("Escolha a operação desejada:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
           
            opcao = input.nextInt();
          
            if ( (opcao <1) || (opcao >4) ){            	
            	System.out.println("Opção inválida");
            	return;				
			};
           
                Scanner input1 = new Scanner(System.in);
                System.out.println("Informe o primeiro número: ");
                num1 = input1.nextInt();
                System.out.println("Informe o segundo número: ");
                num2 = input1.nextInt();
                
                if (opcao == 1) {
                    int operacao = x.somar(num1, num2);
                    System.out.printf("\nO resultado da soma é: %2f\n", operacao);
                } else if (opcao == 2) {
                	int operacao = x.subtrair(num1, num2);
                    System.out.printf("\nO resultado da subtração é: %d\n", operacao);
                } else if (opcao == 3) {
                	int operacao = x.multiplicar(num1, num2);
                    System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
                } else if (opcao == 4) {
                	int operacao = x.dividir(num1, num2);
                    System.out.printf("\nO resultado da divisão é: %d\n", operacao);
                }
            
        } 
}