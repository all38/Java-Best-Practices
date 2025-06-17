package ClassesMetodos;

class CalculadoraEstatica {
    // Métodos estáticos não precisam de instância para serem chamados
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método de instância
    public int multiplicar(int a, int b) {
        return a * b;
    }
}

public class MetodoEstatico {
	
	public static void Executar () {
	
		int resultado = CalculadoraEstatica.somar(2,2);
		System.out.println("Resultado da soma: " + resultado);
		
	}
}
