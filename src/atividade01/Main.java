package atividade01;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int tipo = 0;
		int menu = 0;
		int numero_conta;
		double valor = 0;
		String nome_completo;
		
		Scanner meuScanner = new Scanner(System.in);
		
		Random r = new Random();
        numero_conta = r.nextInt((9999 - 1000) + 1) + 1000;
		
        
		Agencia agencia = new Agencia (123, "Agência Cursino");
		Banco banco = new Banco (321, "Ipirandex");
		
		System.out.println("Bem-vindx a agência Cursino do banco Ipirandex, por favor "
				+ "informe seus dados para abrir a conta desejada.");
		
		System.out.printf("Informe seu nome completo: ");
		nome_completo = meuScanner.next();
		
		
		do {
			System.out.println("Informe o tipo de conta desejado");
			System.out.println("[1] - Conta Corrente");
			System.out.println("[2] - Conta Poupança");
			System.out.println("[3] - Conta Conjunta");
			System.out.printf("Opção: ");
			tipo = meuScanner.nextInt();
			
			if(tipo < 1 || tipo > 3) {
				System.out.println("Tipo de conta inválida. Por favor, tente novamente.");
			}
			
		}while(tipo < 1 || tipo > 3);
		
		Conta conta = new Conta();
		conta.abrir(numero_conta, nome_completo, tipo, agencia, banco);	
		
		do {
			System.out.println("|||||||  MENU   |||||||");
			System.out.println("Escolha a opção desejada.");
			System.out.println("[1] - Consultar saldo");
			System.out.println("[2] - Saque");
			System.out.println("[3] - Depósito");
			System.out.println("[4] - Encerrar conta");
			System.out.println("[5] - Sair");
			System.out.printf("Opção: ");
			menu = meuScanner.nextInt();
			
			switch (menu) {
				case 1:
					conta.consultar();
			    	break;
			    	
				case 2:
					System.out.println("Informe o valor a ser sacado: ");
					valor = meuScanner.nextDouble();
					conta.debitar(valor);
			    	break;
			    	
				case 3:
					System.out.println("Informe o valor a ser depositado: ");
					valor = meuScanner.nextDouble();
					conta.creditar(valor);
				    break;
				    
				case 4:
				    if(conta.encerrar()) {
				    	menu = 5;
				    }
				    break;
				    
				case 5:
					System.out.println("Você optou por sair.");
				    break;
				    
				default:
					System.out.println("Tipo de conta inválida. Por favor, tente novamente.");
			}
			
		}while (menu != 5);
		
		System.out.println("Volte sempre!");

	}

}
