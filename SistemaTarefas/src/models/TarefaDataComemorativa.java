package models;
import view.ExecutarTarefas;


public class TarefaDataComemorativa extends Tarefa implements ExecutarTarefas {
    private String Datas;
    
    @Override
    public String toString() {
        return super.toString() + "TarefaDataComemorativa [Datas=" + Datas + "]";
    }

    public TarefaDataComemorativa(int id, String titulo, String descricao, String dataTarefa, String prioridade,
            String status, String datas) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        Datas = datas;
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa de data comemorativa: " + getTitulo());
    }

    public String getDatas() {
        return Datas;
    }

    public void setDatas(String datas) {
        Datas = datas;
    }
}
