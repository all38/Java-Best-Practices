package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaFor {

	public static void Executar () {
		
		Scanner scanner = new Scanner(System.in);
		double somatorio = 0;
		int tamanhoTurma  = 0;
		
		System.out.println("Informe o tamanho da Turma por favor");
		tamanhoTurma = scanner.nextInt();
		
		//for(inicialização; condição; incremento) {} // bloco de uso de codigo
		    // Bloco de código que será repetido
		
		for (int i = 1; i <= tamanhoTurma; i++) { 
			System.out.println("Informe a nota do aluno! " + i + ": ");
			double notaAtual = scanner.nextDouble();
			somatorio += notaAtual;
		}
		
		
		double media = (tamanhoTurma > 0) ? (somatorio / tamanhoTurma) : 0;
		System.out.println("A média da turma é : " + media);
	
		scanner.close();
	}
}
