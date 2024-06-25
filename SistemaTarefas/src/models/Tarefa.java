package models;

public abstract class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String dataTarefa;
    private String prioridade;
    private String status;

    public Tarefa(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataTarefa = dataTarefa;
        this.prioridade = prioridade;
        this.status = "Pendete";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTarefa() {
        return dataTarefa;
    }

    public void setDataTarefa(String dataTarefa) {
        this.dataTarefa = dataTarefa;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataTarefa='" + dataTarefa + '\'' +
                ", prioridade='" + prioridade + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}

