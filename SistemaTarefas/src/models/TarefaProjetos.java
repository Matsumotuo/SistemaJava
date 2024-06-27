package models;

import view.ExecutarTarefas;

public class TarefaProjetos extends TodasAsTarefas implements ExecutarTarefas {
    private String Qual;

    @Override
    public String toString() {
        return super.toString() + "TarefaProjetos [Qual=" + Qual + "]";
    }

    public TarefaProjetos(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status,
            String qual) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        Qual = qual;
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa de projetos: " + getTitulo());
    }

    public String getQual() {
        return Qual;
    }

    public void setQual(String qual) {
        Qual = qual;
    }
}
