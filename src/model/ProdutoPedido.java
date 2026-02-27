
package model;


public class ProdutoPedido {
      private Produto produto;
    private int quantidade;
    private double subtotal;

    public ProdutoPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = produto.calcularSubtotal(quantidade);
    }

    public double getSubtotal() {
        return subtotal;
    }
}
