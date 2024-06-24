package models;
import view.ExecutarTarefas;

public class TarefaFinanceira extends Tarefa implements ExecutarTarefas {
    private String OlharData;



    @Override
    public String toString() {
        return super.toString() + "TarefaFinanceira [OlharData=" + OlharData + "]";
    }



    public TarefaFinanceira(int id, String titulo, String descricao, String dataTarefa, String prioridade,
            String status, String olharData) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        OlharData = olharData;
    }



    @Override
    public void executar() {
        System.out.println("Executando tarefa financeira: " + getTitulo());
    }



    public String getOlharData() {
        return OlharData;
    }



    public void setOlharData(String olharData) {
        OlharData = olharData;
    }
}
