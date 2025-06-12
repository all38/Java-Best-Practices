package Fundamentos;

public class OperadoresLogicos {

	public static void Executar () {
		
		var executouTrabalho1 = true;
		var executouTrabalho2 = false;
		
		boolean comprouSorvete = executouTrabalho1 && executouTrabalho2; // E // true && false = false   
		System.out.println("Comprou sorvete? True or False? " + comprouSorvete);
		
		boolean comprouTv50 = executouTrabalho1 || executouTrabalho2;
		System.out.println("Comprou a TV ?" + comprouTv50);
		
		// não nessesariamente preciso setar o tipo diretamente, mas sim o tipo do retorno da variavel
		var comprouTv32 = executouTrabalho1 ^ executouTrabalho2; // OU Exclusivo // true ^ false = true
        System.out.println("Comprou a Tv 32? " + comprouTv32);
	
        if (executouTrabalho1 && executouTrabalho2 == false) { // uma maneira não pratica para um problema simples
        	System.out.println("Ele não fez o serviço direito!");
        } else {
        	System.out.println("Ele fez o serviço direito!");
        }
	}	
}
