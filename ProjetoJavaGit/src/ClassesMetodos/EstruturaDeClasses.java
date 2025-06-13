package ClassesMetodos;

import ExtensoesClassesMetodos.Pessoa;

public class EstruturaDeClasses {

	public static void Executar () {
		
		Pessoa sicrano = new Pessoa();
		sicrano.nome = "Sicrano";
		sicrano.idade = 20;
		
		System.out.print(sicrano.nome + " tem " + sicrano.idade + " anos"); 
		// imprimindo os valores dos atributos da classe pessoa
		
		var fulano = new Pessoa();
		fulano.nome = "Beto";
		fulano.idade = 45;
		
		var apresentacaoFulano = fulano.apresentar();
	}
	 
}
