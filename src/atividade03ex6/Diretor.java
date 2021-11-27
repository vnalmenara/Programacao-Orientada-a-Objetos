package atividade03ex6;

public class Diretor extends Empregado implements Acionista, CargoConfianca{
	
	public Diretor(){
	}
	
		
	public Diretor(String nome, String departamento) {
		super(nome, departamento);
	}


	@Override
	public void ganhar() {
		System.out.println("Recebi meu pr�-labore!");
	}


	@Override
	public void trabalhar() {
		System.out.println("Preciso ir as minhas reuni�es. Agenda lotada!");
	}


	@Override
	public void falar() {
		System.out.println("Nossa empresa � s�lida e crescer� ainda mais nesse semestre!");
	}


	@Override
	public void retiraCarro() {
		System.out.println("Pegando as chaves e retirando ve�culo da empresa...");
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
		System.out.println("A��o em baixa, hora de comprar e injetar mais dinheiro!");
	}


	@Override
	public void votar() {
		System.out.println("Indo votar...");
	}
	

}
