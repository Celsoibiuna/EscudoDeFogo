import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {


    private static final String URL = "jdbc:mysql://localhost:3306/escudo_de_fogo";
    private static final String USER = "root"; // Substitua pelo seu usuário do MySQL
    private static final String PASSWORD = "senha"; // Substitua pela sua senha do MySQL

    // Método para obter a conexão
    public static Connection getConnection() {
        try {
            Class.forName("mysql-connector-j-9.1.0.tar.gz");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
}

