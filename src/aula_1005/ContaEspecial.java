package aula_1005;

public class ContaEspecial extends ContaBancaria {
  private int diaAniversario;
  
  public void saque(double valor){
	  saldo -=  valor + ((valor * 10) /100);
  }

  public void deposita(double valor){
	  saldo += valor - ((valor * 10) /100);
  }  
}
