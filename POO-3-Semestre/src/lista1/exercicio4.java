package lista1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario;
		Double novoSalario;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe seu sal�rio atual: ");
		salario = meuScanner.nextFloat();
		
		novoSalario = salario * 1.25;
		
		System.out.println("Seu novo sal�rio �: " + novoSalario);
		
	}

}
