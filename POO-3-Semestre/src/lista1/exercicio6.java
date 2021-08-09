package lista1;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salarioAReceber;
		float salarioBase;
		
		Scanner meuScanner = new Scanner(System.in);
		
		System.out.printf("Informe seu salário base: ");
		salarioBase = meuScanner.nextFloat();
		
		salarioAReceber = salarioBase * 1.05;
		
		salarioAReceber = salarioAReceber * 0.93;
		
		System.out.println("O salário a receber é: " + salarioAReceber);

	}

}
