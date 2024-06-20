package produto.model;

public class Eletronico extends GeralProd{

	private String marca;
	private String modelo;
	
	 // Construtor
    public Eletronico(String nome, String descricao, double preco, int quantidade, String marca, String modelo) {
        super(nome, descricao, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
    
    @Override
    public void visualizar() {
    	super.visualizar();
    	 System.out.println("Marca do produto: " + this.marca);
         System.out.println("Modelo do produto: " + this.modelo);
    }
}
