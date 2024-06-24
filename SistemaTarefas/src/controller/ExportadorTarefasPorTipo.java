package controller;

import models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ExportadorTarefasPorTipo {

    public void exportarListaTarefasPorTipo(List<Tarefa> tarefas, String nomeArquivo) {
        int totalUrgentes = 0;
        int totalPessoais = 0;
        int totalTrabalho = 0;
        int totalLazer = 0;
        int totalEstudo = 0;

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println("Lista de Tarefas por Tipo:");
            writer.println();

            for (Tarefa tarefa : tarefas) {
                if (tarefa instanceof TarefaUrgente) {
                    writer.println("Tarefa Urgente: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Motivo de Urgência: " + ((TarefaUrgente) tarefa).getMotivoUrgencia());
                    writer.println();
                    totalUrgentes++;
                } else if (tarefa instanceof TarefaPessoal) {
                    writer.println("Tarefa Pessoal: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Pessoa Envolvida: " + ((TarefaPessoal) tarefa).getPessoaEnvolvida());
                    writer.println();
                    totalPessoais++;
                } else if (tarefa instanceof TarefaTrabalho) {
                    writer.println("Tarefa de Trabalho: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Setor: " + ((TarefaTrabalho) tarefa).getSetor());
                    writer.println();
                    totalTrabalho++;
                } else if (tarefa instanceof TarefaLazer) {
                    writer.println("Tarefa de Lazer: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Local: " + ((TarefaLazer) tarefa).getLocal());
                    writer.println();
                    totalLazer++;
                } else if (tarefa instanceof TarefaEstudo) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaEstudo) tarefa).getDisciplina());
                    writer.println();
                    totalEstudo++;
                }
            }

            writer.println("Total de Tarefas Urgentes: " + totalUrgentes);
            writer.println("Total de Tarefas Pessoais: " + totalPessoais);
            writer.println("Total de Tarefas de Trabalho: " + totalTrabalho);
            writer.println("Total de Tarefas de Lazer: " + totalLazer);
            writer.println("Total de Tarefas de Estudo: " + totalEstudo);

            System.out.println("Lista de tarefas exportada para o arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao exportar lista de tarefas para o arquivo: " + e.getMessage());
        }
    }
}