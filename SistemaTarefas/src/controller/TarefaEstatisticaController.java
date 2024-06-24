package controller;

import models.Tarefa;
import java.util.List;

public class TarefaEstatisticaController {
    public int contarTarefasPorPrioridade(List<Tarefa> tarefas, String prioridade) {
        int count = 0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getPrioridade().equalsIgnoreCase(prioridade)) {
                count++;
            }
        }
        return count;
    }

    public int contarTarefasPorStatus(List<Tarefa> tarefas, String status) {
        int count = 0;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equalsIgnoreCase(status)) {
                count++;
            }
        }
        return count;
    }

    public void mostrarEstatisticas(List<Tarefa> tarefas) {
        int totalTarefas = tarefas.size();
        int totalPendentes = contarTarefasPorStatus(tarefas, "Pendente");
        int totalConcluidas = contarTarefasPorStatus(tarefas, "Concluída");
        
        System.out.println("Estatísticas das Tarefas:");
        System.out.println("Total de Tarefas: " + totalTarefas);
        System.out.println("Total Pendentes: " + totalPendentes);
        System.out.println("Total Concluídas: " + totalConcluidas);
    }
}