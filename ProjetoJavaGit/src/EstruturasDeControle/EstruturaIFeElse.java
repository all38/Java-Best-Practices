package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaIFeElse {
	
	public static void Executar () {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a Nota");
		double nota = scanner.nextInt();
		
		if (nota < 7) {
			System.out.println("Não passou!!");
		} else {
			System.out.print("Passou!");
		}
		
		scanner.close(); // boas praticas
	}
}
