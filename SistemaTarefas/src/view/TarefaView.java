package view;

import models.TodasAsTarefas;

import java.util.List;

public class TarefaView {
    public void mostrarTarefas(List<TodasAsTarefas> tarefas) {
        for (TodasAsTarefas tarefa : tarefas) {
            System.out.println(tarefa.toString());
        }
    }

    public void mostrarDetalhesTarefa(TodasAsTarefas tarefa) {
        System.out.println("Detalhes da Tarefa:");
        System.out.println(tarefa.toString());
    }
}