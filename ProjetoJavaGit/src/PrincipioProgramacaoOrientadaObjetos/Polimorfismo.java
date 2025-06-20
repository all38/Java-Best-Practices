package PrincipioProgramacaoOrientadaObjetos;

class Comida {
	
	public double Peso;
	public Comida (double peso) {
		Peso = peso;
	}
	
	public Comida () {
		
	}
}

class Feijao extends Comida {
	public Feijao (double peso) {
		super(peso);
	}
}

class Arroz extends Comida {
	public Arroz() {}
}

class Carne extends Comida {
    public Carne() { }
}

class Pessoa {
	
	public double Peso;
	
	public void Comer (Comida comida) {
		this.Peso += comida.Peso;
	}
}

public class Polimorfismo {

	public static void Executar () {

		Feijao ingrediente1 = new Feijao(0.3);
		Arroz ingrediente2 = new Arroz();
		ingrediente2.Peso = 0.25;
		Carne ingrediente3 = new Carne();
		ingrediente3.Peso = 80.2;
		
		Pessoa cliente = new Pessoa();
		cliente.Peso = 80.0;
		
		cliente.Comer(ingrediente1);
		cliente.Comer(ingrediente2);
		cliente.Comer(ingrediente3);
		
		System.out.println("Agora o peso do cliente é : " + cliente.Peso);
		
		
	}
}
