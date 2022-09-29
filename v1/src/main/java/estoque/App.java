package estoque;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.estoque.Compras;
import main.java.estoque.Usuario;
import main.java.estoque.Produtos.Internacional;
import main.java.estoque.Produtos.Nacional;
import main.java.estoque.Produtos.Produtos;

public class App {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Produtos> produtos;
    private ArrayList<Compras> historico;

    private static Usuario getUsuario(String nome){
        for (Usuario usuario : usuarios ) {
            if(usuario.getName().equals(nome)){
                return usuario;
            }
        }
        return RuntimeException("Por favor crie um usuário");
    }
    private boolean senhaCorreta(String name,String senha){
        Usuario usuario = getUsuario(name);
        if(usuario.getSenha()== senha){
            return true;
        }
        return false;
    }
    private Produtos getProduto(String nome){
        for (Produtos produto : produtos ) {
            if(produto.getNome().equals(nome)){
                return produto;
            }
        }
        return RuntimeException("Produto em falta ou não existe");
    }
    private boolean temNoEstoque(int quantidade){
        Produtos produto = getProduto(nome);
        if(produto.getQuantidade()>= quantidade){
            return true;
        }
        return false;

     }
     private int getQuantidade(int quantidade){
        for(Produto produto: produtos){
            if(produto.getQuantidade().equals(quantidade)){
                return produto.getQuantidade();
            }
        }
        return RuntimeException("Não temos o suficiente para atender sua demanada");
     }
     private void compra( String nameU, String nameP, int quantidade ){
        Produtos produto = getProduto(nameP);
        Usuario usuario = getUsuario(nameU);
        int i = produto.getQuantidade();
        produto.setQuantidade(i - 1);;
        Compra realizada = new Compras(nameU, nameP, quantidade);
        historico.add(realizada);
     }
     private int diminuirQuantidade(String name, int quantidade){
        Produtos produto = getProduto(nome);
        int i = produto.getQuantidade();
        produto.setQuantidade(i - quantidade);

     }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeU, senha , nameP;
        int Quantidade, produto = 0;
        Usuario a =  new Usuario("André", "andrecarvalho1402@gmail.com","abcde", "08786349406");
        Usuario b = new Usuario ("Luiz","pfpa1234@gmail.com","abcde","83290538254");
        Produtos carro = new Nacional( "renegade", "10", "20");
        Produtos bicicleta = new Internacional("BMX", "20", "20");
        Compras compraA = new Compras(a, bicicleta, 5);
        Compras compraB = new Compras(a, carro, 3);
        Compras compraC = new Compras(b, carro, 1);
        Compras compraD = new Compras(b,bicicleta,2);

        System.out.println("Bem vindo");
        System.out.println("Faça seu Login: ");
        nomeU = s.next();
        System.out.println("Digite sua senha: ");
        senha = s.next();
        Usuario teste =  getUsuario(nomeU);
        if(!teste.senhaCorreta(senha)){
            throw new RuntimeException("Senha incorreta");
        }
        System.out.println("Vamos comprar
        !");
        System.out.println("1- "+carro.getNome());
        System.out.println("2- "+bicicleta.getNome());


    }
}
