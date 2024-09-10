package produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void getDados() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade + ", Valor Total: R$" + getValorTotalEstoque());
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Quantidade solicitada excede o estoque disponível!");
        }
    }

    public double getValorTotalEstoque() {
        return preco * quantidade;
    }
}