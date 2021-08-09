package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, peso1, nota2, peso2, nota3, peso3, mediaPonderada;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe a primeira nota: ");
		nota1 = meuScanner.nextFloat();
		
		System.out.printf("Informe o peso atribuido a primeira nota: ");
		peso1 = meuScanner.nextFloat();
		
		System.out.printf("Informe a segunda nota: ");
		nota2 = meuScanner.nextFloat();
		
		System.out.printf("Informe o peso atribuido a segunda nota: ");
		peso2 = meuScanner.nextFloat();
		
		System.out.printf("Informe a terceira nota: ");
		nota3 = meuScanner.nextFloat();
		
		System.out.printf("Informe o peso atribuido a terceira nota: ");
		peso3 = meuScanner.nextFloat();
		
		mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada das notas é: " + mediaPonderada);

	}

}
