package Central;

import java.util.LinkedHashMap;
import java.util.Map;

import Fundamentos.Conversoes;
import Fundamentos.FormatandoNumeros;
import Fundamentos.LendoDados;
import Fundamentos.NotacaoPonto;
import Fundamentos.PrimeiroPrograma;
import Fundamentos.VariaveisEConstantes;

public class Program {

	public static void main (String [] args) { // Método Principal em Java
 		
		Map<String, Runnable> exercicios = new LinkedHashMap<>(); 
 	
 		// Adiciona exercícios usando lambdas (expressões anônimas) / exercicios.put("nome da classe - contexto ", () -> nomedaclasse.Executar());
 		
 		// fundamentos
 		exercicios.put("Primeiro Programa - Fundamentos", () -> PrimeiroPrograma.Executar());
 		exercicios.put("Variaveis - Fundamentos", () -> VariaveisEConstantes.Executar());
 		exercicios.put("Notação Ponto", () -> NotacaoPonto.Executar());
 		exercicios.put("Lendo Dados", () -> LendoDados.Executar());
 		exercicios.put("Formatando Números", () -> FormatandoNumeros.Executar());
 		exercicios.put("Conversões ", () -> Conversoes.Executar());
	
 		// Instancia a central e inicia a seleção
 		CentralDeExercicios central = new CentralDeExercicios(exercicios);
 		central.selecionarEExecutar();
	}
}
