package models;
import view.ExecutarTarefas;

public class TarefaAlimentacao extends Tarefa implements ExecutarTarefas {
private String Prato;



    public TarefaAlimentacao(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status,
        String prato) {
    super(id, titulo, descricao, dataTarefa, prioridade, status);
    Prato = prato;
}



    @Override
public String toString() {
    return super.toString() + "TarefaAlimentacao [Prato=" + Prato + "]";
}



    @Override
    public void executar() {
        System.out.println("Executando tarefa de alimentação: " + getTitulo());
    }



    public String getPrato() {
        return Prato;
    }



    public void setPrato(String prato) {
        Prato = prato;
    }
}
