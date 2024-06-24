package models;

import view.ExecutarTarefas;

public class TarefaLazer extends Tarefa implements ExecutarTarefas {
    private String local;

  
    public TarefaLazer(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String local) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.local = local;
    }

   
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", local='" + local + '\'' + '}';
    }

   
    @Override
    public void executar() {
        System.out.println("A tarefa de lazer '" + getTitulo() + "' está sendo executada no local: " + local);
    }
}