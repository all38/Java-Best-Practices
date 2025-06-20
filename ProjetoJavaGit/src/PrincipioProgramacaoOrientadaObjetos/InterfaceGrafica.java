package PrincipioProgramacaoOrientadaObjetos;

import java.util.ArrayList;
import java.util.List;

interface OperacaoBinaria {
	int operacao(int a, int b);
}

class soma implements OperacaoBinaria {
	public int operacao(int a, int b) {
		return a + b;
	}
}

class subtracao implements OperacaoBinaria {
	public int operacao(int a, int b) {
		return a - b;
	}
}

class multiplicacao implements OperacaoBinaria {
	public int operacao(int a, int b) {
		return a * b;
	}
}

class Calculadora {
	
	List<OperacaoBinaria> operacoes = new ArrayList<OperacaoBinaria>();
	
	public Calculadora () {
        operacoes.add(new soma());
        operacoes.add(new subtracao());
        operacoes.add(new multiplicacao());
    }
	
	public String executarOperacoes(int a, int b) {
		StringBuilder resultado = new StringBuilder();
		
		for (OperacaoBinaria op : operacoes) {
            resultado
            		.append("Usando ")
                    .append(op.getClass().getSimpleName())
                    .append(" = ")
                    .append(op.operacao(a, b))
                    .append("\n");
        }
		
		return resultado.toString();
	}
}

public class InterfaceGrafica {

	public static void Executar () {
		
		Calculadora calc = new Calculadora();
		String resultado = calc.executarOperacoes(20, 5);
		System.out.println(resultado);
	}
}
