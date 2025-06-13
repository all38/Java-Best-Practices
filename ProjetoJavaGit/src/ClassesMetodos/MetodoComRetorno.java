package ClassesMetodos;

class CalculadoraComum {
	
	public int Somar(int a, int b) {
		return a + b;
	}
	
	public int Subtrair (int c, int d) {
		return c - d;
	}
	
	public int Multiplicar (int e, int f) {
		return e * f;
	}
	
	public int Dividir (int g, int h) {
		return g / h;
	}
}

class CalculadoraCadeia {
	
	int memoria;
	
	public CalculadoraCadeia Somar (int a) {
		memoria += a;
		return this;
	}
	
	public CalculadoraCadeia Subtrair (int a) {
		memoria -= a;
		return this;
	}
	
	public CalculadoraCadeia Multiplicar (int a) {
		memoria *= a;
		return this;
	}
	
	public CalculadoraCadeia Dividir (int a) {
		memoria /= a;
		return this;
	}
	
	public CalculadoraCadeia limpar() {
        memoria = 0;
        return this;
    }

    public CalculadoraCadeia imprimir() {
        System.out.println(memoria);
        return this;
    }

    public int resultado() {
        return memoria;
    }
}

public class MetodoComRetorno {
		
	public static void Executar () {
		
		var CalculadoraComum = new CalculadoraComum();
		var resultado = CalculadoraComum.Somar(10, 5);
		
		System.out.println(resultado);
		System.out.println(CalculadoraComum.Multiplicar(10,5));
		System.out.println(CalculadoraComum.Subtrair(10,5));
		
		CalculadoraCadeia calculadoraCadeia = new CalculadoraCadeia();
        calculadoraCadeia.Somar(3).Multiplicar(3).imprimir().Subtrair(2).Dividir(2).imprimir().limpar().imprimir();
        
        System.out.println(resultado);
		
	}
}
