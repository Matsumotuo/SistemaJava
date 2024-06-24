package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import models.Tarefa;
import models.TarefaAlimentacao;
import models.TarefaDataComemorativa;
import models.TarefaEstudo;
import models.TarefaExercicio;
import models.TarefaFinanceira;
import models.TarefaLazer;
import models.TarefaPessoal;
import models.TarefaProjetos;
import models.TarefaTrabalho;
import models.TarefaUrgente;

public class ExportadorTarefasPorTipo {

    public void exportarListaTarefasPorTipo(List<Tarefa> tarefas, String nomeArquivo) {
        int totalUrgentes = 0;
        int totalPessoais = 0;
        int totalTrabalho = 0;
        int totalLazer = 0;
        int totalEstudo = 0;
        int totalAlimento = 0;
        int totalNiver = 0;
        int totalExer = 0;
        int totalFinanc = 0;
        int totalProjeto = 0;

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
                }else if (tarefa instanceof TarefaAlimentacao) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaAlimentacao) tarefa).getPrato());
                    writer.println();
                    totalAlimento++;
                }
                else if (tarefa instanceof TarefaDataComemorativa) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaDataComemorativa) tarefa).getDatas());
                    writer.println();
                    totalNiver++;
                }
                else if (tarefa instanceof TarefaExercicio) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaExercicio) tarefa).getTipoExercicio());
                    writer.println();
                    totalExer++;
                }else if (tarefa instanceof TarefaFinanceira) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaFinanceira) tarefa).getOlharData());
                    writer.println();
                    totalFinanc++;
                }else if (tarefa instanceof TarefaProjetos) {
                    writer.println("Tarefa de Estudo: " + tarefa.getTitulo());
                    writer.println("Descrição: " + tarefa.getDescricao());
                    writer.println("Disciplina: " + ((TarefaProjetos) tarefa).getQual());
                    writer.println();
                    totalProjeto++;
                }
            }
            

            writer.println("Total de Tarefas Urgentes: " + totalUrgentes);
            writer.println("Total de Tarefas Pessoais: " + totalPessoais);
            writer.println("Total de Tarefas de Trabalho: " + totalTrabalho);
            writer.println("Total de Tarefas de Lazer: " + totalLazer);
            writer.println("Total de Tarefas de Estudo: " + totalEstudo);
            writer.println("Total de Tarefas de Alimentação: " + totalAlimento);
            writer.println("Total de Tarefas de Datas comemorativas: " + totalNiver);
            writer.println("Total de Tarefas de Exercicios: " + totalExer);
            writer.println("Total de Tarefas de Financeiro: " + totalFinanc);
            writer.println("Total de Tarefas dos Projetos: " + totalProjeto);

            System.out.println("Lista de tarefas exportada para o arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao exportar lista de tarefas para o arquivo: " + e.getMessage());
        }
    }
}