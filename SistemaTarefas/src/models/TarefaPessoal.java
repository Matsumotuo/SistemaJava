package models;

import view.ExecutarTarefas;

public class TarefaPessoal extends Tarefa implements ExecutarTarefas {
    private String pessoaEnvolvida;

    public TarefaPessoal(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String pessoaEnvolvida) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.pessoaEnvolvida = pessoaEnvolvida;
    }

  
    public String getPessoaEnvolvida() {
        return pessoaEnvolvida;
    }

    public void setPessoaEnvolvida(String pessoaEnvolvida) {
        this.pessoaEnvolvida = pessoaEnvolvida;
    }

  
    @Override
    public String toString() {
        return super.toString() + ", pessoaEnvolvida='" + pessoaEnvolvida + '\'' + '}';
    }


    @Override
    public void executar() {
        System.out.println("A tarefa pessoal '" + getTitulo() + "' está sendo executada com: " + pessoaEnvolvida);
    }
}