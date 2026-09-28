import clases.Estoque;
import clases.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args){
          Estoque estoque = new Estoque();
          List<Produto> produtos = new ArrayList<>();

          produtos.add(new Produto(produtos.size(), "Arroz", 20, 8, 10, 24.90));
          produtos.add(new Produto(produtos.size(),"Feijão", 25, 10, 30, 49.90));

          for (int i = 0; i < produtos.size(); i++) {
               produtos.get(i).exibaProdutos();
          }
     }
}
