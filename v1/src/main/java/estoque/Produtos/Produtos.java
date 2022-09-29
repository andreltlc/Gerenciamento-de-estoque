package main.java.estoque.Produtos;

public abstract class Produtos {
    protected String nome;
    protected int quantidade;
    protected double preco;
    public  Produtos(String nome, double preco, int quantidade) {
        this.nome =nome;
        this.preco =preco;
        this.quantidade = quantidade;
    }
    public abstract double precificar(double preco) {
        return preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    
    
}
