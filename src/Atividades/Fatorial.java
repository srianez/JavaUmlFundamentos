package Atividades;

public class Fatorial {  
    public Fatorial(int n) {
    	
    	int fat = n;    
    	int i = fat - 1;
    	
        while (i > 0) {
            fat = fat * i;
            i--;
        }      
        System.out.println("O fatorial do numero " + n + " é: " + fat);
    }
}