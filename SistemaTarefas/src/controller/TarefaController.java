package controller;

import models.TodasAsTarefas;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private List<TodasAsTarefas> tarefas;

    public TarefaController() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(TodasAsTarefas tarefa) {
        tarefas.add(tarefa);
    }

    public void editarTarefa(int id, TodasAsTarefas tarefaAtualizada) {
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

    public List<TodasAsTarefas> listarTarefas() {
        return tarefas;
    }
}
