package main.java.estoque.Produtos;

public class Internacional extends Produtos {

    public Internacional(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
        
    }
    public double precificar(double preco){
        return this.preco * 1.3;
    }
    
}
