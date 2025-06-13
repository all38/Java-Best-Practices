package EstruturasDeControle;

import java.util.Random;

public class EstruturaBreak {

	public static void Executar () {
		
		Random random = new Random();
		int numero = random.nextInt(1,51);
		
		System.out.println("Número Sorteado " + numero);
		
		for (int i = 1 ; i <= 50; i++) {
			System.out.print("É o número que queremos ? " + i + " ");
			if (i == numero) {
				System.out.println("Sim!");
				break;
			} else {
				System.out.println("Não!");
			}
		}
		System.out.println("Fim do programa!");
 	}
}
