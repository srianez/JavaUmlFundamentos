package aula_1005;

public class ContaBancaria {
	protected double saldo;
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		//Atributos obrigatórios para classe ContaBancaria e dos "filhos"
		this.nomeCliente = nomeCliente;
		this.endCliente = endCliente;
		this.cpfCliente = cpfCliente;
	}             

	public void saque(double valor){
		saldo -=valor;
	}
	public void deposita(double valor){
		saldo += valor;
	}

	public double getSaldo(){
		return saldo;
	}

	public double getTaxaBancaria(){
		return(1);
	}

	public double getTaxaBancaria(int dias){
		return(dias * 1);
	}

	public double getTaxaBancaria(int dias, int meses){
		return( ((meses * 30) + dias) * 1);
	}  

}
