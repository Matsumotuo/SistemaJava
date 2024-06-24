package view;

import models.Tarefa;
import java.util.List;

public class TarefaView {
    public void mostrarTarefas(List<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.toString());
        }
    }

    public void mostrarDetalhesTarefa(Tarefa tarefa) {
        System.out.println("Detalhes da Tarefa:");
        System.out.println(tarefa.toString());
    }
}