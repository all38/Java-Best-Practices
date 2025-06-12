package Fundamentos;

public class OperadoresRelacionais {

	public static void Executar () {
	
		double nota = 6.0;
		double notaDeCorte = 7; // não nessesariamente precisa colocar a casa decimal 
		
		System.out.println("A nota é invalida ? " + (nota > 10 || nota <10)); // Verifica se a nota é maior que 10 ou menor que 0
		System.out.println("Nota invalida ? " + (nota > 10 || nota > 0)); // Verifica se a nota é maior que 10 ou maior que 0
		System.out.println("Perfeito ? " +  (nota == 10)); // Verifica se a nota é igual a 10
		System.out.println("tem que melhorar ? " + (nota != 10)); // Verifica se a nota é diferente de 10
		System.out.println("Aprovado ? " + (nota >= notaDeCorte)); // Verifica se a nota é maior ou igual a nota de corte
		System.out.println("Recuperação ? " + (nota < notaDeCorte)); // Verifica se a nota é menor que a nota de corte
		System.out.println("Reprovado ? " + (nota <= 3.0)); 
	}
}
