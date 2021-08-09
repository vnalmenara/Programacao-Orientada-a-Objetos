package lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, mediaAritmetica;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe a primeira nota: ");
		nota1 = meuScanner.nextFloat();
		
		System.out.printf("Informe a segunda nota: ");
		nota2 = meuScanner.nextFloat();
		
		System.out.printf("Informe a terceira nota: ");
		nota3 = meuScanner.nextFloat();
		
		mediaAritmetica = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média aritmética das notas é: " + mediaAritmetica);
		
	}

}
