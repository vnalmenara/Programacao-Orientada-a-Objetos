package atividade03;

public class Supervisor extends Empregado{
	
	public Supervisor(){
	}
	
		
	public Supervisor(String nome, String departamento) {
		super(nome, departamento);
	}


	@Override
	public void ganhar() {
		System.out.println("Recebi meu sal�rio!");
	}


	@Override
	public void trabalhar() {
		System.out.println("Preciso avaliar meus funcion�rios este m�s.");
	}


	@Override
	public void falar() {
		System.out.println("Bem-vindo ao time, sou seu supervisor e este � seu local de trabalho!");
	}
	

}
