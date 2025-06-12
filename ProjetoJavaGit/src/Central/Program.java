package Central;

import java.util.LinkedHashMap;
import java.util.Map;

import EstruturasDeControle.EstruturaDoWhile;
import EstruturasDeControle.EstruturaIF;
import EstruturasDeControle.EstruturaIFeElse;
import EstruturasDeControle.EstruturaIFeElseIF;
import EstruturasDeControle.EstruturaSwitch;
import EstruturasDeControle.EstruturaWhile;
import Fundamentos.Conversoes;
import Fundamentos.FormatandoNumeros;
import Fundamentos.LendoDados;
import Fundamentos.NotacaoPonto;
import Fundamentos.OperadorTernario;
import Fundamentos.OperadorUnario;
import Fundamentos.OperadoresAritimeticos;
import Fundamentos.OperadoresDeAtribuicao;
import Fundamentos.OperadoresLogicos;
import Fundamentos.OperadoresRelacionais;
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
 		exercicios.put("Operadores Aritimeticos", () -> OperadoresAritimeticos.Executar());
 		exercicios.put("Operadores Relacionais", () -> OperadoresRelacionais.Executar());
 		exercicios.put("Operadores Logicos", () -> OperadoresLogicos.Executar());
 		exercicios.put("Operadores De Atribuicao", () -> OperadoresDeAtribuicao.Executar());
 		exercicios.put("Operadores Unarios", () -> OperadorUnario.Executar());
 		exercicios.put("Operador Ternario", () -> OperadorTernario.Executar());
 		
 		// estrutura de controle
 		exercicios.put("Estrutura IF", () -> EstruturaIF.Executar());
 		exercicios.put("Estrutura IF e Else", () -> EstruturaIFeElse.Executar());
 		exercicios.put("Estrutura IF e Else IF", () -> EstruturaIFeElseIF.Executar());
 		exercicios.put("Estrutura Switch", () -> EstruturaSwitch.Executar());
 		exercicios.put("Estrutura While", () -> EstruturaWhile.Executar());
 		exercicios.put("Estrutura Do While", () -> EstruturaDoWhile.Executar());
 		
 		// Instancia a central e inicia a seleção
 		CentralDeExercicios central = new CentralDeExercicios(exercicios);
 		central.selecionarEExecutar();
	}
}
