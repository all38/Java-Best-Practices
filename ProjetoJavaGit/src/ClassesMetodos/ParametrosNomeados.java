package ClassesMetodos;

public class ParametrosNomeados {

	public static void Formatar (int dia, int mes, int ano) {	
		System.out.printf("%02d/%02d/%d%n", dia, mes, ano); // Objeto como parâmetro (Pattern "Parameter Object");
	}
	
	public static void Executar () {
		Formatar(19,1,1934);
	}
}
