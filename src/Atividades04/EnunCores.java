package Atividades04;

public class EnunCores {

	public enum Cores {
		NOME_COR, CODIGO_COR
	};

	private String nome;
	private Integer codigo;

   public void Cores(String nome, Integer codigo){
	   this.nome = nome;
	   this.codigo = codigo;
   }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
