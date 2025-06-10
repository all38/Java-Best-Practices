package Fundamentos;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatandoNumeros {

	public static void Executar () {
		
		double valor = 15.7465;
		
		// formata com 1 casa decimal
		System.out.printf("Valor com 1 casa decimal: %.1f%n", valor); // ex: 15.2
		
		// formata para moeda local (R$)
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
		System.out.println("Moeda local: " + formatoMoeda.format(valor));// Ex: R$ 15,18 (depende do locale do sistema)
		
		NumberFormat formatoPorcentagem = NumberFormat.getPercentInstance();
		System.out.println("Porcentagem: " + formatoPorcentagem.format(valor)); // Ex: 1.517 (Java multiplica por 100 automaticamente)
		
		// formata como moeda brasileira com 3 casas decimais
		Locale brasil = new Locale("pt","BR");
		NumberFormat moedaBrasileira = NumberFormat.getCurrencyInstance(brasil);
		moedaBrasileira.setMinimumFractionDigits(3); // força 3 casas decimais
        moedaBrasileira.setMaximumFractionDigits(3);
        System.out.println("Moeda BR com 3 casas decimais: " + moedaBrasileira.format(valor)); // Ex: R$ 15,175
		
        // Inteiro com 10 dígitos preenchido com zeros à esquerda
        int inteiro = 256;
        System.out.printf("Inteiro com 10 dígitos: %010d%n", inteiro); // Ex: 0000000256
	}
	
}
