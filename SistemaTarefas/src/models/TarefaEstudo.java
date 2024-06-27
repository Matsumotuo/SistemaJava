package models;

import view.ExecutarTarefas;

public class TarefaEstudo extends Tarefa implements ExecutarTarefas {
    private String disciplina;
    private int duracaoEstimada;  
    private boolean isPratica;    

    

    public TarefaEstudo(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status,
            String disciplina, int duracaoEstimada, boolean isPratica) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.disciplina = disciplina;
        this.duracaoEstimada = duracaoEstimada;
        this.isPratica = isPratica;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public boolean isPratica() {
        return isPratica;
    }

    public void setPratica(boolean pratica) {
        isPratica = pratica;
    }

    @Override
    public String toString() {
        return super.toString() + 
                ", disciplina='" + disciplina + '\'' + 
                ", duracaoEstimada=" + duracaoEstimada + 
                ", isPratica=" + isPratica + 
                '}';
    }

    @Override
    public void executar() {
        System.out.println("A tarefa de estudo '" + getTitulo() + "' está sendo executada.");
    }

    public int calcularTempoEstimado() {
        return duracaoEstimada;
    }


    public void atualizarStatus(String novoStatus) {
        setStatus(novoStatus);
        System.out.println("O status da tarefa '" + getTitulo() + "' foi atualizado para: " + novoStatus);
    }

}