package servicos;
import entidades.Produto;
import java.util.ArrayList;
import java.util.List;

public class ServicosDeProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void inserirProduto(Produto produto){
        this.produtos.add(produto);
    }
}