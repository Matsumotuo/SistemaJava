package models;

import view.ExecutarTarefas;

public class TarefaTrabalho extends Tarefa implements ExecutarTarefas {

    private String setor;

    //Construtor
    public TarefaTrabalho(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String setor) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.setor = setor;
    }

    //Get e Set
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //Override do toString
    @Override
    public String toString() {
        return super.toString() + ", setor='" + setor + '\'' + '}';
    }

    //Implentação de Realizar Tarefa
    @Override
    public void executar() {
        System.out.println("A tarefa de trabalho '" + getTitulo() + "' está sendo executada.");
    }
}
