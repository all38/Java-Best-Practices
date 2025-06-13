package EstruturasDeControle;

import java.util.Random;
import java.util.Scanner;

public class EstruturaWhile {

	public static void Executar () {
		
		int palpite = 0;
		Random random = new Random(); // gera um número aleatorio
		Scanner scanner = new Scanner(System.in);
		
		int numeroSecreto = random.nextInt(1,10);
		boolean numeroEncontrado = false;
		int tentativasRestantes = 5;
		int tentativas = 0;
		
		System.out.println(numeroSecreto);
		
		while (tentativasRestantes > 0 && !numeroEncontrado) { // enquanto atender os requesitos continuara rodando
            System.out.print("Insira o seu palpite: ");
            String entrada = scanner.nextLine();

            try {
                palpite = Integer.parseInt(entrada); // Converte entrada para inteiro
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                continue; // Volta para o início do while
            }

            tentativas++;
            tentativasRestantes--;

            if (numeroSecreto == palpite) {
                numeroEncontrado = true;
                System.out.println("Número encontrado em " + tentativas + " tentativas!");
                System.out.println("Bom Palpite!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Número menor pó..... tenta dv");
                System.out.println("Tentativas restantes.... " + tentativasRestantes);
            } else {
                System.out.println("Número maior carai..... tenta dv");
                System.out.println("Tentativas restantes.... " + tentativasRestantes);
            }
        }
		scanner.close(); // Fecha o Scanner (boa prática)
	}
}
