package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {

    private static int contador = 1;

    private int id;
    private LocalDate data;
    private List<ItemVenda> itens;
    private FormaPagamento formaPagamento;
    private double total; // Adicionado para facilitar a listagem

    public Venda() {
        this.id = contador++;
        this.data = LocalDate.now();
        this.itens = new ArrayList<>();
    }

    // --- NOVOS MÉTODOS PARA O DAO USAR ---
    
    public void setId(int id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // -------------------------------------

    public void adicionarItem(Produto produto, int quantidade) {
        for (ItemVenda item : itens) {
            if (item.getProduto().getId() == produto.getId()) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                return;
            }
        }
        itens.add(new ItemVenda(produto, quantidade));
    }

    public double getTotal() {
        // Se o total já foi setado (vindo do banco), retorna ele
        if (this.total > 0 && itens.isEmpty()) {
            return this.total;
        }
        // Caso contrário, calcula pelos itens (venda nova)
        double soma = 0;
        for (ItemVenda item : itens) {
            soma += item.getSubtotal();
        }
        return soma;
    }

    // Getters permanecem iguais...
    public int getId() { return id; }
    public LocalDate getData() { return data; }
    public List<ItemVenda> getItens() { return itens; }
    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(FormaPagamento formaPagamento) { this.formaPagamento = formaPagamento; }
    
    public void removerItem(int idProduto) {
    // Remove o item da lista caso o ID do produto seja igual ao informado
    itens.removeIf(item -> item.getProduto().getId() == idProduto);
}
}