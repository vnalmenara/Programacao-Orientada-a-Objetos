package atividade01;

public class Conta {
	int numero;
	String nome_cliente;
	double saldo;
	int tipo;
	Agencia agencia;
	Banco banco;
	
	
	public Conta(int numero, String nome_cliente, double saldo, int tipo, Agencia agencia, Banco banco) {
		super();
		this.numero = numero;
		this.nome_cliente = nome_cliente;
		this.saldo = saldo;
		this.tipo = tipo;
		this.agencia = agencia;
		this.banco = banco;
	}
	
	
	public Conta() {

	}


	public void abrir(int numero, String nome_cliente, int tipo, Agencia agencia, Banco banco) {
		this.numero = numero;
		this.nome_cliente = nome_cliente;
		this.saldo = 0;
		this.tipo = tipo;
		this.agencia = agencia;
		this.banco = banco;
		
		System.out.println("Conta nº " + this.numero + " aberta com sucesso!");
		
	}
	
	public boolean encerrar() {
		if(this.saldo < 0) {
			System.out.println("Saldo negativo. Você não pode encerrar a conta.");
			return false;
		}
		else {
			System.out.println("Saldo atual: " + this.saldo);
			this.tipo = 4;
			this.saldo = 0;
			System.out.println("Valores retirados. Saldo zerado. Conta nº " + this.numero + " encerrada.");
			return true;
		}
	}
	
	
	public void consultar() {
		System.out.println("Saldo atual: " + this.saldo);
	}
	
	
	public void creditar(double credito) {
		if(this.tipo != 4) {
			this.saldo += credito;
		}
		
		System.out.println("Saldo atualizado: " + this.saldo);
	}
	
	public void debitar(double debito) {
		if(this.tipo != 4) {
			this.saldo -= debito;
		}
		
		System.out.println("Saldo atualizado: " + this.saldo);
	}
		
}


