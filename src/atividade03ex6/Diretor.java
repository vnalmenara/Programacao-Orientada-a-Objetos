package atividade03ex6;

public class Diretor extends Empregado implements Acionista, CargoConfianca{
	
	public Diretor(){
	}
	
		
	public Diretor(String nome, String departamento) {
		super(nome, departamento);
	}


	@Override
	public void ganhar() {
		System.out.println("Recebi meu pró-labore!");
	}


	@Override
	public void trabalhar() {
		System.out.println("Preciso ir as minhas reuniões. Agenda lotada!");
	}


	@Override
	public void falar() {
		System.out.println("Nossa empresa é sólida e crescerá ainda mais nesse semestre!");
	}


	@Override
	public void retiraCarro() {
		System.out.println("Pegando as chaves e retirando veículo da empresa...");
	}


	@Override
	public void solicitaHospedagem() {
		System.out.println("Estou viajando em nome da empresa para um grande congresso...");
	}


	@Override
	public void venderAcao() {
		System.out.println("Hora de resgatar esse lucro!");
	}


	@Override
	public void comprarAcao() {
		System.out.println("Ação em baixa, hora de comprar e injetar mais dinheiro!");
	}


	@Override
	public void votar() {
		System.out.println("Indo votar...");
	}
	

}
