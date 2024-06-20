package produto.repository;

import produto.model. CaracteristicaGeralDoProduto;

public interface ProdutoRepository {

	public void buscarProduto(int id);
	public void listarProdutos();
	public void cadastrarProduto( CaracteristicaGeralDoProduto produto);
	public void atualizarProduto( CaracteristicaGeralDoProduto produto);
	public void excluirProduto(int id);
	
}
