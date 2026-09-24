package entidades;
import entidades.enums.Categoria;
import java.math.BigDecimal;
import java.util.UUID;

//BigDecimal é um tipo espesifico para valor monetário.

public class Produto {
    private UUID id;
    private String nome;
    private BigDecimal preco;
    private Integer tamanho;
    private Boolean ativo;
    private Integer estoque;
    private Categoria categoria;

    public Produto(String nome, BigDecimal preco, Integer tamanho, Boolean ativo, Integer estoque, Categoria categoria) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ativo = ativo;
        this.estoque = estoque;
        this.categoria = categoria;
    }
}