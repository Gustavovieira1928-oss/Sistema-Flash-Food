
package dao;

import model.Categoria;          // Importa sua classe Categoria
import java.sql.Connection;     // Para gerenciar a conexão
import java.sql.PreparedStatement; // Para executar o SQL com segurança
import java.sql.ResultSet;      // Para receber os dados do banco
import java.sql.SQLException;   // Para tratar erros de SQL
import java.util.ArrayList;     // Para criar a lista de categorias
import java.util.List;

public class CategoriaDAO {
    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT id, nome_categoria FROM categorias";
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                categorias.add(new Categoria(rs.getInt("id"), rs.getString("nome_categoria")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return categorias;
    }
}