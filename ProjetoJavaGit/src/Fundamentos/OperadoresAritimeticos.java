package Fundamentos;

public class OperadoresAritimeticos {

	public static void Executar () {
	
		// preço com desconto
		
		var preco = 1000;
		var imposto = 355;
		var desconto = 0.1;
		
		double total = preco + imposto;
		var totalComDesconto = total - (total * desconto);
		System.out.println("O valor total do produto ou serviço é" + totalComDesconto);

		double peso = 91.2;
		double altura = 1.82;
		double imc = peso / (altura * altura);
		System.out.printf("O IMC é %.2f%n", imc);
	
		int par = 24; 
		double impar = 55; // colocar como double quando se divide, como int ele só vai voltar como inteiro
		System.out.println("É par quando em sua divisão por 2 resulta em metade de seu valor inteiro sendo par: " + par + " resulta " + (par / 2));
		System.out.println("É impar pois em sua divisão por 2 resulta em metade de seu valor sendo número com virgula sendo impar: " + impar + " resulta em: " + (impar / 2));
	}
}
