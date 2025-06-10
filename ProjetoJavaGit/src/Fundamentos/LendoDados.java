package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class LendoDados {

	public static void Executar () {
		
		Scanner scanner = new Scanner(System.in); // Scanner para a entrada de dados do console
		
		System.out.println("Qual é seu nome gafanhoto? "); 
		String nomeGafanhoto = scanner.nextLine(); // lê uma linha inteira (String)
		System.out.println("Seja Bem vindo ao meu repositorio Git de Java " + nomeGafanhoto + "!!!!");
	
		System.out.println("Qual a sua idade? ");
		int idadeGafanhoto = scanner.nextInt();
		
		if (idadeGafanhoto >= 18) { // if // caso
			System.out.println("hmmmm um adulto de " + idadeGafanhoto + " Já suspeitava");
		} else { // else // caso não seja // tambem temos o else if () que nos permite adicionar mais condições
			System.out.println("hmmmm um gafanhoto mesmo, usuflua desse diretorio");
		}
		
		System.out.print("Qual o seu salário? ");
        double salario = scanner.nextDouble(); // Lê um número decimal (double)
		
        // Ajuste de cultura para usar ponto ao invés de vírgula
        // (Em Java o separador decimal depende da configuração do teclado e local do sistema)
        System.out.printf(Locale.US, "%s %d R$%.2f%n", nomeGafanhoto, idadeGafanhoto, salario);
     
        scanner.close(); // Fecha o scanner (boas práticas)
	}
}