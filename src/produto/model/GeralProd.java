package produto.model;

public abstract class GeralProd {

	//Definindo as variáveis
	
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
	// Construtor
	public GeralProd(String nome, String descricao, double preco, int quantidade) {

		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}


	//Métodos Getters and Setters
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
	
  //Exibir informações do produto
	
	public void visualizar() {
         System.out.println("\n\n**************************************");
         System.out.println("Dados do produto");
         System.out.println("**************************************");
         System.out.println("Nome do produto: " + this.nome);
         System.out.println("Descrição do produto: " + this.descricao);
         System.out.println("Preço do produto: " + this.preco);
         System.out.println("Quantidade do produto: " + this.quantidade);
         
    }
	
}
