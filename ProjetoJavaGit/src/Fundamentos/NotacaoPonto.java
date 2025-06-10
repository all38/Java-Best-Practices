package Fundamentos;

public class NotacaoPonto {
	
	public static void Executar() {
	
		// Variavel String que é modificado usando métodos da classe string
		String saudacao = "Olá".toUpperCase().substring(0,3) + " World!";
		// "Olá".toUpperCase() // Deixa a string em maiúsculas: "OLÁ"
			// .substring(0, 3) // Em Java, não existe Insert direto como C#, então manipulamos com substring.
				// + " World!";     // Concatenamos " World!" após os 3 primeiros caracteres.
		
		saudacao = saudacao.replace("World!", "Mundo!"); // Substitui "World!" por "Mundo!"
		
		System.out.println(saudacao); // Imprime: OLÁ Mundo!
		System.out.println("Teste".length()); // Imprime o comprimento da string "Teste" (5)
		String valorImportante = null;  // Variável String nula
		
		// O operador de acesso seguro "?." do C# não existe em Java.
        // Para evitar NullPointerException, fazemos uma verificação explícita:
		System.out.println(valorImportante != null ? valorImportante.length() : "Valor Importante é nulo");
	}
}
