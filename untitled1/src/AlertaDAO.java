import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlertaDAO {

    // Método para inserir um novo alerta no banco de dados
    public boolean inserirAlerta(Alerta alerta) {
        String sql = "INSERT INTO alertas (localizacao, gravidade, status) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, alerta.getLocalizacao());
            pstmt.setString(2, alerta.getGravidade());
            pstmt.setString(3, alerta.getStatus());

            int rowsInserted = pstmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir alerta: " + e.getMessage());
            return false;
        }
    }

    // Método para listar todos os alertas do banco de dados
    public List<Alerta> listarAlertas() {
        String sql = "SELECT * FROM alertas";
        List<Alerta> alertas = new ArrayList<>();

        try (Connection conn = Conexao.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Alerta alerta = new Alerta();
                alerta.setId(rs.getInt("id"));
                alerta.setLocalizacao(rs.getString("localizacao"));
                alerta.setGravidade(rs.getString("gravidade"));
                alerta.setStatus(rs.getString("status"));
                alerta.setDataHora(rs.getString("data_hora"));

                alertas.add(alerta);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alertas: " + e.getMessage());
        }

        return alertas;
    }
}

