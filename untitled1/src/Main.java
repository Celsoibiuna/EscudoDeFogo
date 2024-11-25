import java.util.List;

public class Main {
    public static void main(String[] args) {


        AlertaDAO alertaDAO = new AlertaDAO();

        // Inserir um alerta de exemplo
        Alerta novoAlerta = new Alerta("Amazônia - Setor 12", "Alta", "Pendente");
        boolean inserido = alertaDAO.inserirAlerta(novoAlerta);
        if (inserido) {
            System.out.println("Alerta inserido com sucesso!");
        } else {
            System.out.println("Falha ao inserir o alerta.");
        }

        // Listar todos os alertas
        List<Alerta> alertas = alertaDAO.listarAlertas();
        if (alertas.isEmpty()) {
            System.out.println("Nenhum alerta encontrado.");
        } else {
            for (Alerta alerta : alertas) {
                System.out.printf("ID: %d | Localização: %s | Gravidade: %s | Status: %s | Data/Hora: %s%n",
                        alerta.getId(), alerta.getLocalizacao(), alerta.getGravidade(),
                        alerta.getStatus(), alerta.getDataHora());
            }
        }
    }
}
