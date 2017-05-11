package aula_1005;

public class ContaEspecial extends ContaBancaria {
  private int diaAniversario;

  public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
	  super(nomeCliente, endCliente, cpfCliente);
  }
  
  public void saque(double valor){
	  saldo -=  valor + ((valor * 10) /100);
  }

  public void deposita(double valor){
	  saldo += valor - ((valor * 10) /100);
  }  
}
