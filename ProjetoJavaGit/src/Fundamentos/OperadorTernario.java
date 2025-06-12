package Fundamentos;

public class OperadorTernario {

	public static void Executar () {
		var nota = 7;
		boolean bomComportamento = true;
	
		String resultado = nota >= 7.0 && bomComportamento ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
