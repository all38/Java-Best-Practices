package Fundamentos;

import java.util.HashMap;
import java.util.Map;

public class OperadoresDeAtribuicao {

	public static void Executar () {
		
		var num1 = 3;
		num1 = 7;
		num1 += 10;
		num1 -= 3;
		num1 *= 5;
		num1 /= 2;
		System.out.println(num1);
		
		int a = 1;
		int b = a;
		a++; // mesma coisa que a + a
		b++; 
		System.out.println(a + " " +  b);
		
		// Cria um novo HashMap chamado 'mapa'.
        // As chaves serão do tipo String e os valores do tipo Object (qualquer tipo de objeto pode ser armazenado).
		Map<String, Object> mapa = new HashMap<>();
		mapa.put("Nome","maria");// Adiciona ao mapa a entrada com a chave "Nome" (com N maiúsculo) e o valor "maria".
		// Tenta obter o valor associado à chave "nome" (com n minúsculo) e imprime na tela.
        // Como a chave correta no mapa é "Nome" (com N maiúsculo), isso vai imprimir "null", 
        // porque "nome" e "Nome" são diferentes — em Java as chaves do Map são case-sensitive (sensíveis a maiúsculas/minúsculas).
		System.out.println(mapa.get("Nome")); // imprime "Maria"
	}
}
