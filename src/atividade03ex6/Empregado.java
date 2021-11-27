package atividade03ex6;


public abstract class Empregado extends Pessoa {
	private String departamento;
	
	Empregado(){
	}
	
	
	public Empregado(String nome, String departamento) {
		super(nome);
		this.departamento = departamento;
	}


	public abstract void ganhar();
	
	public abstract void trabalhar();
			

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}