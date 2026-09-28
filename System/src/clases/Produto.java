package clases;

import java.rmi.server.UID;
import java.util.UUID;

public class Produto extends Estoque{
    private int id;
    private String nome;
    private float altura;
    private float largura;
    private float peso;
    private double preco;

    public Produto(int id, String nome, float altura, float largura, float peso, double preco) {
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.largura = largura;
        this.peso = peso;
        this.preco = preco;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibaProdutos(){
        System.out.println(String.format("Nome do Produto: %s", getNome()));
    }
}
