package models;

import view.ExecutarTarefas;

public class TarefaPessoal extends Tarefa implements ExecutarTarefas {
    private String pessoaEnvolvida;

    // Construtor
    public TarefaPessoal(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status, String pessoaEnvolvida) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        this.pessoaEnvolvida = pessoaEnvolvida;
    }

    // Get e Set
    public String getPessoaEnvolvida() {
        return pessoaEnvolvida;
    }

    public void setPessoaEnvolvida(String pessoaEnvolvida) {
        this.pessoaEnvolvida = pessoaEnvolvida;
    }

    // Override do toString
    @Override
    public String toString() {
        return super.toString() + ", pessoaEnvolvida='" + pessoaEnvolvida + '\'' + '}';
    }

    // Implementação de Executar
    @Override
    public void executar() {
        System.out.println("A tarefa pessoal '" + getTitulo() + "' está sendo executada com: " + pessoaEnvolvida);
    }
}