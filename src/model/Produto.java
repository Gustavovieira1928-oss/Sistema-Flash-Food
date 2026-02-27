
package model;


public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private Categoria categoria;
    private double preco;

    public Produto(int id, String nome, String descricao, Categoria categoria, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }
    public double calcularSubtotal(int qtd) {return preco * qtd;}

    public String getNome() {return nome;}

    public double getPreco() {return preco;}

    public int getId() {return id;}

    public String getDescricao() { return descricao;}

    public Categoria getCategoria() {return categoria;}

    public void setId(int id) {this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public void setPreco(double preco) {this.preco = preco;}
    
}
