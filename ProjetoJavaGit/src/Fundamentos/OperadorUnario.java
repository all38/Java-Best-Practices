package Fundamentos;

public class OperadorUnario {

	public static void Executar () {
		
		var valorNegativo = 5;
		var numero1 = 2;
		var numero2 = 3;
		var booleano = true;
		
		System.out.println(-valorNegativo);
		System.out.println(!booleano);
		numero1 ++;
		System.out.println(numero1);
		numero1 ++;
		System.out.println(numero1 + "," + numero2);
		System.out.println(numero1++ == --numero2);
	}
}
