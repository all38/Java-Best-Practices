package ExtensoesClassesMetodos;

public class Pessoa {

	public String nome; // método public, acessivel de fora da classe
	public int idade;	
	
	// Método público que retorna uma String
	public String apresentar () {
		return "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
	}
	
	// Método público que imprime no console
    public void apresentarNoConsole() {
        System.out.println(apresentar()); // chama o método apresentar()
    }
}
