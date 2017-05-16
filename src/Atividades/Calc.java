package Atividades;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calc {
	
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double dividir(double num1, double num2) {
        return num1 / num2;
    }
    
    public double multiplicar(double num1, double num2) {
            return num1 * num2;
    }
    
    public static void main(String args[]) {
            
            Calc x = new Calc();
            
            int opcao = 5;
            double num1;
            double num2;
            
            Scanner input = new Scanner(System.in);
            System.out.println("Escolha a operação desejada:");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("9. Nenhuma");
           
            opcao = input.nextInt();
           
            while (opcao != 0) {
                Scanner input1 = new Scanner(System.in);
                System.out.println("Informe o primeiro número: ");
                num1 = input1.nextDouble();
                System.out.println("Informe o segundo número: ");
                num2 = input1.nextDouble();
                
                if (opcao == 1) {
                    double operacao = x.somar(num1, num2);
                    System.out.printf("\nO resultado da soma é: %2f\n", operacao);
                    break;
                } else if (opcao == 2) {
                	double operacao = x.subtrair(num1, num2);
                    System.out.printf("\nO resultado da subtração é: %d\n", operacao);
                    break;
                } else if (opcao == 3) {
                	double operacao = x.multiplicar(num1, num2);
                    System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
                    break;
                } else if (opcao == 4) {
                	double operacao = x.dividir(num1, num2);
                    System.out.printf("\nO resultado da divisão é: %d\n", operacao);
                    break;
                } else {
                    break;
                }
            }
        } 
}