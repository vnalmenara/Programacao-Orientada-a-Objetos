package empresa;

public abstract class Pessoa {
	private String nome;

	Pessoa(){
	}
	
	Pessoa(String nome) {
		this.nome = nome;
	}
	
	public abstract void falar();
		
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}