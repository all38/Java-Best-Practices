package Fundamentos;

import java.util.Scanner;

public class Conversoes {

	public static void Executar () {
		
		Scanner scanner = new Scanner(System.in);
		
		int inteiro = 10;
		double quebrado = inteiro; // Conversão implicita (upcasting)
		System.out.println(quebrado); // 10
		
		double nota = 9.7;
		// int notaTruncada = nota; // ERRO: não compila (como no C#)
		int notaTruncada = (int) nota; // Converção explicita (dowcasting)
		System.out.println("nota Truncada: " + notaTruncada);
		
		System.out.print("Digite sua idade: ");
        String idadeGafanhotoString = scanner.nextLine(); // Lê string do teclado
        int idadeInteiro = Integer.parseInt(idadeGafanhotoString); // Converte string para int
        System.out.println("Idade inserida: " + idadeInteiro);
	
        // Conversão usando método equivalente ao Convert.ToInt32 (não existe em Java, usa-se parse novamente)
        idadeInteiro = Integer.parseInt(idadeGafanhotoString);
        System.out.println("Idade inserida novamente: " + idadeInteiro);
	
        // Usando tratamento de exceção para simular TryParse
        System.out.print("Digite o primeiro número: ");
        String palavra = scanner.nextLine();
        int numero1 = 0;
        try { // try - tente
            numero1 = Integer.parseInt(palavra);
        } catch (NumberFormatException e) { // cath - captura o erro e faz um tratamento (resulta)
            numero1 = 0; // valor padrão se entrada for inválida
        }
        System.out.println("Resultado 1: " + numero1);
        
        System.out.print("Digite o segundo número: ");
        int numero2 = 0;
        try {
            numero2 = Integer.parseInt(scanner.nextLine()); 
        } catch (NumberFormatException e) {
            numero2 = 0; // valor padrão se entrada for inválida
        }
        System.out.println("Resultado 2: " + numero2);

        scanner.close(); // boas praticas - feche o que se abre (vc não deixa a porta aberta quando said de casa né ?)
	}
}
