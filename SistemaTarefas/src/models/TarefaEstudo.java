package models;

import view.ExecutarTarefas;

public class TarefaEstudo extends Tarefa implements ExecutarTarefas {
    private String disciplina;

    //Construtor
    public TarefaEstudo(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String disciplina) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.disciplina = disciplina;
    }

    //Get e Set
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //Override do toString
    @Override
    public String toString() {
        return super.toString() + ", disciplina='" + disciplina + '\'' + '}';
    }

    //Implentação de Realizar Tarefa
    @Override
    public void executar() {
        System.out.println("A tarefa de estudo '" + getTitulo() + "' está sendo executada.");
    }
}
