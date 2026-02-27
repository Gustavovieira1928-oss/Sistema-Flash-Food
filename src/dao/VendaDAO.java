package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.FormaPagamento;
import model.Venda;
import model.ItemVenda;

public class VendaDAO {

    public void salvar(Venda venda) {

        String sqlVenda = "INSERT INTO vendas (data, total, forma_pagamento) VALUES (?, ?, ?)";

        String sqlItem = "INSERT INTO itens_vendas (venda_id, produto_id, quantidade, subtotal) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection()) {
   
            conn.setAutoCommit(false);

            try (PreparedStatement stmtVenda = conn.prepareStatement(sqlVenda, Statement.RETURN_GENERATED_KEYS)) {
                

                if (venda.getFormaPagamento() == null) {
                    throw new SQLException("Forma de pagamento não definida no objeto Venda.");
                }

    
                stmtVenda.setDate(1, Date.valueOf(venda.getData()));
                stmtVenda.setDouble(2, venda.getTotal());
              
                stmtVenda.setString(3, venda.getFormaPagamento().name()); 
                
                stmtVenda.executeUpdate();

        
                ResultSet rs = stmtVenda.getGeneratedKeys();
                int idVenda = 0;
                if (rs.next()) {
                    idVenda = rs.getInt(1);
                }

               
                try (PreparedStatement stmtItem = conn.prepareStatement(sqlItem)) {
                    for (ItemVenda item : venda.getItens()) {
                        stmtItem.setInt(1, idVenda);
                        stmtItem.setInt(2, item.getProduto().getId());
                        stmtItem.setInt(3, item.getQuantidade());
                        stmtItem.setDouble(4, item.getSubtotal());
                        stmtItem.addBatch(); // Adiciona ao pacote de execução
                    }
                    stmtItem.executeBatch(); // Executa todos de uma vez (mais rápido)
                }

              
                conn.commit(); 
                System.out.println("Venda e itens gravados com sucesso!");

            } catch (SQLException e) {
               
                conn.rollback(); 
                throw e;
            }
        } catch (SQLException e) {
            System.out.println("Erro técnico no banco de dados: " + e.getMessage());
          
            throw new RuntimeException(e);
        }
    }
public List<Venda> listar() {
    List<Venda> lista = new ArrayList<>();
    String sql = "SELECT id, data, total, forma_pagamento FROM vendas ORDER BY id DESC";

    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Venda v = new Venda();
            v.setId(rs.getInt("id"));
            v.setData(rs.getDate("data").toLocalDate());
            v.setTotal(rs.getDouble("total"));
            
            // Converte a String do banco de volta para o Enum
            String formaStr = rs.getString("forma_pagamento");
            if (formaStr != null) {
                v.setFormaPagamento(FormaPagamento.valueOf(formaStr));
            }

            lista.add(v);
        }
    } catch (SQLException e) {
        System.out.println("Erro ao listar vendas: " + e.getMessage());
    }
    return lista;
}
}