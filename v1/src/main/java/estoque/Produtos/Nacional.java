package main.java.estoque.Produtos;

public class Nacional extends Produtos {

    

    public Nacional(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }
    public double precificar(double preco) {
        return preco;
    }

    
}
