package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, d, resultado;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe um n�mero: ");
		a = meuScanner.nextInt();
		
		System.out.printf("Informe um n�mero: ");
		b = meuScanner.nextInt();
		
		System.out.printf("Informe um n�mero: ");
		c = meuScanner.nextInt();
		
		System.out.printf("Informe um n�mero: ");
		d = meuScanner.nextInt();
		
		resultado = a + b + c + d;
		
		System.out.println("O resultado da soma �: " + resultado);
		
	}

}
