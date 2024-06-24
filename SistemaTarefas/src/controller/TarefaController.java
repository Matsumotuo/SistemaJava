package controller;

import models.Tarefa;
import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private List<Tarefa> tarefas;

    public TarefaController() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void editarTarefa(int id, Tarefa tarefaAtualizada) {
        for (int i = 0; i < tarefas.size(); i++) {
            if (tarefas.get(i).getId() == id) {
                tarefas.set(i, tarefaAtualizada);
                break;
            }
        }
    }

    public void excluirTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.getId() == id);
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }
}
