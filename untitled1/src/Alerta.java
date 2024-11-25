public class Alerta {
    private int id;
    private String localizacao;
    private String gravidade;
    private String status;
    private String dataHora;

    // Construtores
    public Alerta() {}

    public Alerta(String localizacao, String gravidade, String status) {
        this.localizacao = localizacao;
        this.gravidade = gravidade;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}

