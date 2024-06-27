package models;

import view.ExecutarTarefas;

public class TarefaTrabalho extends TodasAsTarefas implements ExecutarTarefas {

    private String setor;

    public TarefaTrabalho(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status,
            String setor) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() + ", setor='" + setor + '\'' + '}';
    }

    @Override
    public void executar() {
        System.out.println("A tarefa de trabalho '" + getTitulo() + "' está sendo executada.");
    }
}
