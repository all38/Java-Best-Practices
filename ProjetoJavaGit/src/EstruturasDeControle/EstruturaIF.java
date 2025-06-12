package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaIF {

	public static void Executar () {
		
		boolean bomComportamento = false;
		String entrada;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Escreva a nota do aluno:");
		entrada = scanner.nextLine();
		
		double  nota = 0;
		try {
			nota = Double.parseDouble(entrada);
		} catch (NumberFormatException e) {
			System.out.println("Valor incorreto!");
		}
		
		System.out.print("Possui bom comportamento (S/N): ");
        entrada = scanner.nextLine(); // Lê a resposta do usuário
        
        if (entrada.equalsIgnoreCase("S")) { // Ignora diferença entre maiúsculo/minúsculo
            bomComportamento = true;
        }

        if (nota >= 9.0 && bomComportamento) {
            System.out.println("Quadro de Honra");
        }
        scanner.close(); // Fecha o scanner para liberar o recurso, boas praticas
	}
}
