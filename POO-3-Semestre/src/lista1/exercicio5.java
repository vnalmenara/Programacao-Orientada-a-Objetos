package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, percentualAumento, novoSalario;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe seu sal�rio atual: ");
		salario = meuScanner.nextFloat();
		
		System.out.printf("Informe o percentual de aumento determinado (somente n�meros): ");
		percentualAumento = meuScanner.nextFloat();
		
		novoSalario = salario * (percentualAumento / 100 + 1);
		
		System.out.printf("Seu novo sal�rio � R$%.2f e o percentual de aumento foi de %.2f%%", novoSalario, percentualAumento);

	}

}
