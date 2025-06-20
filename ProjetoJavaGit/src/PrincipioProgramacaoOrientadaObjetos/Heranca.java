package PrincipioProgramacaoOrientadaObjetos;

class Carro {
	
    protected final int velocidadeMaxima;
    private int velocidadeAtual;

    public Carro (int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    protected int alterarVelocidade (int delta) {
        int novaVelocidade = velocidadeAtual + delta;

        if (novaVelocidade < 0) {
            velocidadeAtual = 0;
        } else if (novaVelocidade > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        } else {
            velocidadeAtual = novaVelocidade;
        }

        return velocidadeAtual;
    }

    public int acelerar() {
        return alterarVelocidade(5);
    }

    public int frear() {
        return alterarVelocidade(-5);
    }
}

class Uno extends Carro {
	
	public Uno() {
        super(200);
    }
}

class Ferrari extends Carro {
	
    public Ferrari() {
        super(350);
    }

    @Override
    public int acelerar() {
        return alterarVelocidade(15);
    }

    // Ocultação de método com mesma assinatura (não recomendado, mas possível em Java via redefinição)
    public int frearFerrari() { // renomeei porque em Java não há 'new' para ocultar método pai
        return alterarVelocidade(-15);
    }
}

public class Heranca {

	public static void Executar () {
		
		System.out.println("Uno...");
        Uno carro1 = new Uno();
        System.out.println(carro1.acelerar());
        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());
        System.out.println(carro1.frear());
        System.out.println(carro1.frear());

        System.out.println("Ferrari...");
        Ferrari carro2 = new Ferrari();
        System.out.println(carro2.acelerar());
        System.out.println(carro2.acelerar());
        // Chamando frearFerrari porque em Java não dá pra ocultar método da classe pai diretamente
        System.out.println(carro2.frearFerrari());
        System.out.println(carro2.frearFerrari());
        System.out.println(carro2.frearFerrari());

        System.out.println("Ferrari com tipo Carro...");
        Carro carro3 = new Ferrari();
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        // Aqui usa o frear da classe pai (Carro), porque o método frearFerrari não existe na classe base
        System.out.println(carro3.frear());
        System.out.println(carro3.frear());
        System.out.println(carro3.frear());

        System.out.println("Uno com tipo Carro...");
        carro3 = new Uno();
        System.out.println(carro3.acelerar());
        System.out.println(carro3.acelerar());
        System.out.println(carro3.frear());
        System.out.println(carro3.frear());
        System.out.println(carro3.frear());
		
	}
}
