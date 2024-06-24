package models;

import view.ExecutarTarefas;

public class TarefaUrgente extends Tarefa implements ExecutarTarefas {
    private String motivoUrgencia;

    // Construtor
    public TarefaUrgente(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String motivoUrgencia) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.motivoUrgencia = motivoUrgencia;
    }

    // Get e Set
    public String getMotivoUrgencia() {
        return motivoUrgencia;
    }

    public void setMotivoUrgencia(String motivoUrgencia) {
        this.motivoUrgencia = motivoUrgencia;
    }

    // Override do toString
    @Override
    public String toString() {
        return super.toString() + ", motivoUrgencia='" + motivoUrgencia + '\'' + '}';
    }

    // Implementação de Executar
    @Override
    public void executar() {
        System.out.println("A tarefa urgente '" + getTitulo() + "' está sendo executada por motivo de: " + motivoUrgencia);
    }
}