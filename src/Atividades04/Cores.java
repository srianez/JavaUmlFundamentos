package Atividades04;

public enum Cores {
	
	BRANCO("Branco", 21),
	PRETO("Preto",22),
	VERMELHO("Preto",23),
	AMARELO("Amarelo",24),
	AZUL("Azul",25);

	private final String nome;
	private final int codigo;
	
	private Cores(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}	

    @Override //override para retornar a string nome e n�o o objeto
    public String toString() { 
        return this.nome; 
    }
	
}