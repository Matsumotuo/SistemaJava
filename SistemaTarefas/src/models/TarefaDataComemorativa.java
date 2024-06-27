package models;

import view.ExecutarTarefas;

public class TarefaDataComemorativa extends TodasAsTarefas implements ExecutarTarefas {
    private String Datas;

    private String localAniversario;
    private int QuantPessoas;
    private String PessoaAniversariante;
    private String presente;

    public TarefaDataComemorativa(int id, String titulo, String descricao, String dataTarefa, String prioridade,
            String status, String datas) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.Datas = datas;
    }

    public String getDatas() {
        return Datas;
    }

    public void setDatas(String datas) {
        Datas = datas;
    }

    @Override
    public String toString() {
        return super.toString() + "TarefaDataComemorativa [Datas=" + Datas + "]";
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa de data comemorativa: " + getTitulo());
    }

}
