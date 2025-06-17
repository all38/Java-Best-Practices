package ClassesMetodos;

public class MetodoVarargs {

	 // Usando varargs (equivalente ao 'params' do C#)
	public static void Recepcionar (String... pessoas) {
		for (String pessoa : pessoas) {
			System.out.println("Olá " + pessoa + " !");
		}
	}
	
	public static void Executar () {
		Recepcionar("Jão","Pé de meia","Arthur morgan","Bill cosby");
	}
}
