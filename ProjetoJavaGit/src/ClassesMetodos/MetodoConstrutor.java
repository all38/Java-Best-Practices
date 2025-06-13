package ClassesMetodos;


class Carro {
	
	public String modelo;
	public String fabricante;
	public int ano;
	
	public Carro(String modelo, String fabricante, int ano) {
		 this.modelo = modelo;
		 this.fabricante = fabricante;
		 this.ano = ano;
	}
	
	public Carro() {
		
	}
}

public class MetodoConstrutor {
	
	public static void Executar () {
		
		Carro carro1 = new Carro();
		carro1.fabricante = "BMW";
		carro1.modelo = "Ferrari";
		carro1.ano = 1985;
		System.out.println(carro1.fabricante + " " + carro1.modelo + " " + carro1 .ano);
		
	}
}

