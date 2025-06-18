package ClassesMetodos;

//Enum definido fora da classe, como é padrão em Java
enum Genero {ACAO, AVENTURA, TERROR,ANIMACAO,COMEDIA}
//Enum é um tipo especial de classe em Java que representa um conjunto fixo de constantes nomeadas.

class Filme {
	
	public String titulo;
	public Genero generoFilme;
	
}

public class MetodoEnum {

	public static void Executar () {
		
		int id = Genero.AVENTURA.ordinal();
		System.out.println(id);
		
		Filme filmeFamilia = new Filme();
		filmeFamilia.titulo = "Sharkneado 34²";
        filmeFamilia.generoFilme = Genero.COMEDIA;

        System.out.printf("%s é %s!%n", filmeFamilia.titulo, filmeFamilia.generoFilme);
	}
}
