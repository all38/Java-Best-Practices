package ClassesMetodos;


class Dependente {
	
	public String Nome;
	public int Idade;
	
}


public class MetodoValorVsReferencia {
	
	public static void Executar () {
		
		int numero = 3;
		int copiaNumero = numero;
		
		System.out.println("O valor de numero é " + numero + " é o valor de sua copia é: " + copiaNumero);
		// incrementamos ++ para ver se sé aplica a referencia
		numero++;
		System.out.println("O valor de numero é " + numero + " é o valor de sua copia é: " + copiaNumero);
		
		Dependente dep = new Dependente();
		dep.Nome = "Beto";
		dep.Idade = 15;
		
		Dependente copiaDep = dep;
		
		System.out.println(dep.Nome + " " + copiaDep.Nome);
        System.out.println(dep.Idade + " " + copiaDep.Idade);
        
        copiaDep.Nome = "Renato"; // altera o mesmo objeto referenciado por 'dep'
        dep.Idade = 21;           // idem, muda o objeto na heap

        System.out.println(dep.Nome + " " + copiaDep.Nome);
        System.out.println(dep.Idade + " " + copiaDep.Idade);
		
	}
}
