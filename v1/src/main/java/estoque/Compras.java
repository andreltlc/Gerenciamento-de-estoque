package main.java.estoque;

public class Compras {
    private Usuario comprador;
    private Produtos comprado;
    private int quantidade;
    
    public Compras(Usuario comprador, Produtos comprado, int quantidade) {
        this.comprador = comprador;
        this.comprado = comprado;
        this.quantidade = quantidade;
    }
    public Usuario getComprador() {
        return comprador;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public Produtos getComprado() {
        return comprado;
    }
    public void setComprado(Produtos comprado) {
        this.comprado = comprado;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
     
}
