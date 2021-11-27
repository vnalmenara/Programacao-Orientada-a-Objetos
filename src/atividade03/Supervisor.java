package atividade03;

public class Supervisor extends Empregado{
	
	public Supervisor(){
	}
	
		
	public Supervisor(String nome, String departamento) {
		super(nome, departamento);
	}


	@Override
	public void ganhar() {
		System.out.println("Recebi meu salário!");
	}


	@Override
	public void trabalhar() {
		System.out.println("Preciso avaliar meus funcionários este mês.");
	}


	@Override
	public void falar() {
		System.out.println("Bem-vindo ao time, sou seu supervisor e este é seu local de trabalho!");
	}
	

}
