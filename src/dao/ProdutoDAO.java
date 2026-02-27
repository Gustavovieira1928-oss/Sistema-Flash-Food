package dao;

import model.Categoria;
import model.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void cadastrar(Produto p) {
        String sql = """
            INSERT INTO produtos (nome, descricao, preco, categoria_id)
            VALUES (?, ?, ?, ?)
        """;

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            ps.setDouble(3, p.getPreco());
            ps.setInt(4, p.getCategoria().getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar produto: " + e.getMessage(), e);
        }
    }

    public List<Produto> listarTodos() {
        List<Produto> lista = new ArrayList<>();

        // SQL Corrigido: Tabela 'categorias' e coluna 'nome_categoria'
        String sql = """
            SELECT p.id, p.nome, p.descricao, p.preco,
                   c.id AS cat_id, c.nome_categoria AS cat_nome
            FROM produtos p
            JOIN categorias c ON c.id = p.categoria_id
        """;

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Categoria cat = new Categoria(
                        rs.getInt("cat_id"),
                        rs.getString("cat_nome")
                );

                Produto p = new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        cat,
                        rs.getDouble("preco")
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos: " + e.getMessage(), e);
        }

        return lista;
    }

    public List<Produto> buscarPorCategoria(String nomeCategoriaBusca) {
        List<Produto> lista = new ArrayList<>();

        // SQL Corrigido: Filtro pelo nome correto da coluna no WHERE
        String sql = """
            SELECT p.id, p.nome, p.descricao, p.preco,
                   c.id AS cat_id, c.nome_categoria AS cat_nome
            FROM produtos p
            JOIN categorias c ON c.id = p.categoria_id
            WHERE c.nome_categoria = ?
        """;

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, nomeCategoriaBusca);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Categoria cat = new Categoria(
                            rs.getInt("cat_id"),
                            rs.getString("cat_nome")
                    );

                    Produto p = new Produto(
                            rs.getInt("id"),
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            cat,
                            rs.getDouble("preco")
                    );

                    lista.add(p);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar por categoria: " + e.getMessage(), e);
        }

        return lista;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir produto: " + e.getMessage(), e);
        }
    }

    public boolean atualizarPreco(int id, double preco) {
        String sql = "UPDATE produtos SET preco = ? WHERE id = ?";

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, preco);
            ps.setInt(2, id);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar preço: " + e.getMessage(), e);
        }
    }
    
public Produto buscarPorId(int id) {
    String sql = "SELECT * FROM produtos WHERE id = ?";
    
    // O try-with-resources garante que a conexão feche sozinha
    try (Connection conn = ConnectionFactory.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setInt(1, id);
        
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                // Criando o objeto com os dados exatos do seu construtor
                return new Produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    null, // Categoria (pode ser null se não for usar na tela de venda)
                    rs.getDouble("preco")
                );
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar produto: " + e.getMessage());
    }
    return null;
}
}