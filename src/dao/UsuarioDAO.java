package dao;

import model.Usuario;
import java.sql.*;

public class UsuarioDAO {

    public boolean cadastrar(Usuario u) {

        String sql =
            "INSERT INTO usuario (nome, login, senha, funcao) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getLogin());
            stmt.setString(3, u.getSenha());
            stmt.setString(4, u.getFuncao());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            return false;
        }
    }

    public Usuario autenticar(String login, String senha) {

        String sql =
            "SELECT * FROM usuario WHERE login = ? AND senha = ?";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Usuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("login"),
                    rs.getString("senha"),
                    rs.getString("funcao")
                );
            }

            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean alterarSenha(String login, String novaSenha) {

    String sql = "UPDATE usuario SET senha = ? WHERE login = ?";

    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, novaSenha);
        stmt.setString(2, login);

        return stmt.executeUpdate() > 0;

    } catch (SQLException e) {
        return false;
    }
}
}