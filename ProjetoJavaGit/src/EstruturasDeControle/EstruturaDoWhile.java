package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaDoWhile {

	public static void Executar () {
		
		Scanner scanner = new Scanner(System.in);
		String entrada;

        do {
            System.out.println("Qual o seu nome?:");
            String nome = scanner.nextLine();

            System.out.println("Seja bem-vindo: " + nome);
            System.out.println("Quer continuar (S/N)?");
            entrada = scanner.nextLine();
        } while (entrada.equalsIgnoreCase("s"));
	}
}
