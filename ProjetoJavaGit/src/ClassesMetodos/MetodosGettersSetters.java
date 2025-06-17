package ClassesMetodos;

class Moto {
	
    private String marca;
    private String modelo;
    private int cilindrada;

    // Construtor com parâmetros
    public Moto(String marca, String modelo, int cilindrada) {
        setMarca(marca);
        setModelo(modelo);
        setCilindrada(cilindrada);
    }

    // Construtor padrão (sem parâmetros)
    public Moto() {
    }

    // Getter e Setter de Marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter e Setter de Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter e Setter de Cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}


public class MetodosGettersSetters {
	
	public static void Executar () {
		Moto moto1 = new Moto("Kawasaki", "Ninja ZX-GR", 600);
		
		System.out.println(moto1.getMarca());
		System.out.println(moto1.getModelo());
		System.out.println(moto1.getCilindrada());
	
		Moto moto2 = new Moto();
		moto2.setMarca("generica");
		moto2.setModelo("Ainda mais Generica");
		moto2.setCilindrada(1200);
		
		System.out.println(moto2.getMarca() + " " + moto2.getModelo() + " " + moto2.getCilindrada());
		
	}
}
