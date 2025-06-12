package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaIFeElseIF {

	public static void Executar () {
		
		Scanner pegaNumero = new Scanner(System.in);
		Scanner pegaString = new Scanner(System.in);
		System.out.println("Digite a nota!: ");
		int nota = pegaNumero.nextInt();
		String simOuNao = "";
		
		if (nota == 10) {
			System.out.println("Quadro de Honra ao merito!");
		} else if (nota >= 7) {
			System.out.println("Aprovado!");
		} else if (nota < 7) {
			System.out.println("Não passou!, estude mais fella, mais pelo menos tem bom comportamento, sim ou não?");
			simOuNao = pegaString.nextLine();
		} 
		
		if (simOuNao.equalsIgnoreCase("sim")) { // use .equalsIgnoreCase para comparar strings corretamente!
			System.out.println("Aprovado!");
		}
		
		
	}
}
