package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/flash_food"
               + "?useSSL=false"
               + "&allowPublicKeyRetrieval=true"
               + "&serverTimezone=UTC";

    String user = "root";
    String password = "Gv##22122000";

    return DriverManager.getConnection(url, user, password);
}
}