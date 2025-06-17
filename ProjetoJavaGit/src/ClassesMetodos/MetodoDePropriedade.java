package ClassesMetodos;

class CarroOpcional {
    
    double desconto = 0.1;
    String nome;
    
    public String getNome () {
        return "Opcional: " + nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    private double preco;
    
    public double getPreco () {
        return preco;
    }
    
    public void setPreco (double preco) {
        this.preco = preco;
    }
    
    public double getPrecoDesconto () {
        return preco - (desconto * preco);
    }
    
    // Construtor padrão
    public CarroOpcional () {
    }

    // Construtor com parâmetros
    public CarroOpcional (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class MetodoDePropriedade {
    
    public static void Executar () {
        CarroOpcional op1 = new CarroOpcional("Teste", 345.99);
        System.out.println(op1.getNome() + " " + op1.getPrecoDesconto());
    
        CarroOpcional op2 = new CarroOpcional();
        op2.setNome("Direção Elétrica");
        op2.setPreco(2349.2);

        System.out.println(op2.getNome() + " " + op2.getPreco());
    }
}
