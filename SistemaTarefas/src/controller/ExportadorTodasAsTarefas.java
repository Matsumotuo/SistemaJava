package controller;

import models.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorTodasAsTarefas {

    public void exportarTodasAsTarefas(List<TodasAsTarefas> tarefas, String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println("Lista de Todas as Tarefas:");
            writer.println();

            for (TodasAsTarefas tarefa : tarefas) {
                writer.println("ID: " + tarefa.getId());
                writer.println("Título: " + tarefa.getTitulo());
                writer.println("Descrição: " + tarefa.getDescricao());
                writer.println("Data da Tarefa: " + tarefa.getDataTarefa());
                writer.println("Prioridade: " + tarefa.getPrioridade());
                writer.println("Status: " + tarefa.getStatus());
                writer.println();
            }

            System.out.println("Lista de todas as tarefas exportada para o arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao exportar lista de tarefas para o arquivo: " + e.getMessage());
        }
    }

}
