package Atividades03;


public class Pessoa {
	
	private String nome;
	private Integer idade;
	private String sexo;
	private String empresa;

	public Pessoa (String nome, int idade, String sexo, String empresa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}
		    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

    @Override //override para retornar a string nome e não o objeto
    public String toString() { 
        return this.nome; 
    } 
		
    
}
