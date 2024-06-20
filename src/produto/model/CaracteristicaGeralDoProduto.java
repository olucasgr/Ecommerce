package produto.model;

public abstract class CaracteristicaGeralDoProduto {
	
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
	public CaracteristicaGeralDoProduto(int id,String nome, String descricao, double preco, int quantidade) {

		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public void visualizar() {
         System.out.println("\n\n**************************************");
         System.out.println("Dados do produto");
         System.out.println("**************************************");
         System.out.println("Id do produto: " + this.id);
         System.out.println("Nome do produto: " + this.nome);
         System.out.println("Descrição do produto: " + this.descricao);
         System.out.println("Preço do produto: " + this.preco);
         System.out.println("Quantidade do produto: " + this.quantidade);
         
    }
	
}
