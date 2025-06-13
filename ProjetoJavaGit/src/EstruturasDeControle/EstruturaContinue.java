package EstruturasDeControle;

public class EstruturaContinue {

	public static void Executar () {
		
		int intervalo = 50;
		System.out.println("Números pares entre 1 e 50");
		
		for (int i = 1; i <= intervalo; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i + " ");
		}
		
	}
}
