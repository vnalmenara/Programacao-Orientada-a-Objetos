package lista1;

import java.util.Scanner;

public class exercicio1entradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Declarando variaveis no Java
        String nome = "José";
        int idade = 10;
        double altura = 1.58;
        float peso = 52.5f; 
        
        Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
        
        System.out.print("Entre com o nome: ");
        nome = meuScanner.nextLine();          // Lê os dados digitados
        
        System.out.print("Entre com a idade: ");
        idade = meuScanner.nextInt();          // Lê os dados digitados

        // Entrar com Altura
        System.out.print("Entre com a altura: ");
        altura = meuScanner.nextDouble();          // Lê os dados digitados
        
        // Entrar com Peso
        System.out.print("Entre com o peso: ");
        peso = meuScanner.nextFloat();          // Lê os dados digitados
        
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
	}
}
