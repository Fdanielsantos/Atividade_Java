package produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();
        
        System.out.print("Quantidade no estoque: ");
        int quantidade = sc.nextInt();
        
        Produto produto = new Produto(nome, preco, quantidade);
        
        produto.getDados();
        
        System.out.print("Quantos produtos deseja adicionar ao estoque? ");
        int qtdAdicionar = sc.nextInt();
        produto.adicionarEstoque(qtdAdicionar);
        produto.getDados();
        
        System.out.print("Quantos produtos deseja remover do estoque? ");
        int qtdRemover = sc.nextInt();
        produto.removerEstoque(qtdRemover);
        produto.getDados();
        
        sc.close();
    }
}