package aula_1005;

public class Main {

 public static void main(String[] args) {
		ContaEspecial conta = new  ContaEspecial();
		
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		
		conta.saque(50);
		System.out.println(conta.getSaldo());
		
		conta.getTaxaBancaria();
		System.out.println(conta.getTaxaBancaria(5, 1));
}	 


}
