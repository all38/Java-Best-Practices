package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void Executar () {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.println("Chute um número de 1 a 10, que irei adivinhar 👓: ");
		int numero = pergunta.nextInt();
		
		switch (numero) {
			case 1: 
				System.out.println("Você digitou 1");
				break;
			case 2: 
				System.out.println("Você digitou 2");
				break;
			case 3: 
				System.out.println("Você digitou 3");
				break;
			case 4: 
				System.out.println("Você digitou 4");
				break;
			case 5: 
				System.out.println("Você digitou 5");
				break;
			case 6: 
				System.out.println("Você digitou 6");
				break;
			case 7: 
				System.out.println("Você digitou 7");
				break;
			case 8: 
				System.out.println("Você digitou 8");
				break;
			case 9: 
				System.out.println("Você digitou 9");
				break;
			case 10: 
				System.out.println("Você digitou 10");
				break;
			default: 
				System.out.println("Vc digiou um número não contabilizado");
		}
		
	}
}
