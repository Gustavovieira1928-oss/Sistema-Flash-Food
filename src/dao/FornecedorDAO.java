package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Fornecedor;
import dao.ConnectionFactory;
import java.util.List;
import java.util.ArrayList;

public class FornecedorDAO {

 
    public boolean inserir(Fornecedor fornecedor) {
        String sql = "INSERT INTO fornecedor (id, nome, cnpj, contato) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, fornecedor.getId());
            stmt.setString(2, fornecedor.getNome());
            stmt.setString(3, fornecedor.getCnpj());
            stmt.setString(4, fornecedor.getContato());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir fornecedor: " + e.getMessage());
            return false;
        }
    }

    // =========================
    // BUSCAR POR CNPJ
    // =========================
 public Fornecedor buscarPorCnpj(String cnpj) {

    String sql = """
        SELECT * FROM fornecedor
        WHERE REPLACE(REPLACE(REPLACE(cnpj, '.', ''), '/', ''), '-', '') = ?
    """;

    try (Connection con = ConnectionFactory.getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, cnpj);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            return new Fornecedor(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cnpj"),
                rs.getString("contato")
            );
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null;
}

    // =========================
    // DELETE
    // =========================
    public boolean excluir(int id) {
        String sql = "DELETE FROM fornecedor WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao excluir fornecedor: " + e.getMessage());
            return false;
        }
    }

    // =========================
    // UPDATE
    // =========================
    public boolean atualizar(Fornecedor fornecedor) {
        String sql = "UPDATE fornecedor SET nome = ?, cnpj = ?, contato = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getContato());
            stmt.setInt(4, fornecedor.getId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar fornecedor: " + e.getMessage());
            return false;
        }
    }
    public List<Fornecedor> listarTodos() {
    List<Fornecedor> lista = new ArrayList<>();
    String sql = "SELECT * FROM fornecedor";

    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            lista.add(new Fornecedor(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("cnpj"),
                rs.getString("contato")
            ));
        }

    } catch (SQLException e) {
        System.out.println("Erro ao listar fornecedores: " + e.getMessage());
    }

    return lista;
}
public boolean excluirPorCnpj(String cnpj) {

    String sql = """
        DELETE FROM fornecedor
        WHERE REPLACE(REPLACE(REPLACE(cnpj, '.', ''), '/', ''), '-', '') = ?
    """;

    try (Connection con = ConnectionFactory.getConnection();
         PreparedStatement pst = con.prepareStatement(sql)) {

        pst.setString(1, cnpj);
        return pst.executeUpdate() > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}