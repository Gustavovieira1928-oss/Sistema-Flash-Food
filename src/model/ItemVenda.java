
package model;

public class ItemVenda {

    private Produto produto;
    private int quantidade;
    private double subtotal;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        calcularSubtotal();}

    private void calcularSubtotal() {this.subtotal = produto.getPreco() * quantidade;}

    public Produto getProduto() {return produto;}

    public void setProduto(Produto produto) {this.produto = produto;  calcularSubtotal();}

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade;calcularSubtotal();}

    public double getSubtotal() { return subtotal;    }
}