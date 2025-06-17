package Central;

import java.util.LinkedHashMap;
import java.util.Map;

import ClassesMetodos.EstruturaDeClasses;
import ClassesMetodos.MetodoComRetorno;
import ClassesMetodos.MetodoConstrutor;
import ClassesMetodos.MetodoDePropriedade;
import ClassesMetodos.MetodoEstatico;
import ClassesMetodos.MetodoVarargs;
import ClassesMetodos.MetodosGettersSetters;
import ClassesMetodos.ParametrosNomeados;
import EstruturasDeControle.EstruturaBreak;
import EstruturasDeControle.EstruturaContinue;
import EstruturasDeControle.EstruturaDoWhile;
import EstruturasDeControle.EstruturaFor;
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
 		exercicios.put("Estrutura For", () -> EstruturaFor.Executar());
 		exercicios.put("Estrutura Break", () -> EstruturaBreak.Executar());
 		exercicios.put("Estrutura Continue", () -> EstruturaContinue.Executar());
 		
 		// Classes e métodos
 		exercicios.put("Estrutura De Classes", () -> EstruturaDeClasses.Executar());
 		exercicios.put("Método Construtor", () -> MetodoConstrutor.Executar());
 		exercicios.put("Método Com Retorno", () -> MetodoComRetorno.Executar());
 		exercicios.put("Método Estatico", () -> MetodoEstatico.Executar());
 		exercicios.put("Método Varargs = params do C#", () -> MetodoVarargs.Executar());
 		exercicios.put("Método de Parametros Nomeados", () -> ParametrosNomeados.Executar());
 		exercicios.put("Método Getters e Setters", () -> MetodosGettersSetters.Executar());
 		exercicios.put("Método De Propriedade", () -> MetodoDePropriedade.Executar());
 		
 		// Instancia a central e inicia a seleção
 		CentralDeExercicios central = new CentralDeExercicios(exercicios);
 		central.selecionarEExecutar();
	}
}
