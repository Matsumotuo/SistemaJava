package controller;

import models.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportadorTodasAsTarefas {

    public List<Tarefa> importarTodasAsTarefas(String nomeArquivo) {
        List<Tarefa> tarefas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            Tarefa tarefa = null;

            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("ID: ")) {
                    if (tarefa != null) {
                        tarefas.add(tarefa);
                    }
                    tarefa = new TarefaConcreta(0, linha, linha, linha, linha, linha);
                    tarefa.setId(Integer.parseInt(linha.substring(4)));
                } else if (linha.startsWith("Título: ")) {
                    if (tarefa != null) {
                        tarefa.setTitulo(linha.substring(8));
                    }
                } else if (linha.startsWith("Descrição: ")) {
                    if (tarefa != null) {
                        tarefa.setDescricao(linha.substring(11));
                    }
                } else if (linha.startsWith("Data da Tarefa: ")) {
                    if (tarefa != null) {
                        tarefa.setDataTarefa(linha.substring(17));
                    }
                } else if (linha.startsWith("Prioridade: ")) {
                    if (tarefa != null) {
                        tarefa.setPrioridade(linha.substring(12));
                    }
                } else if (linha.startsWith("Status: ")) {
                    if (tarefa != null) {
                        tarefa.setStatus(linha.substring(8));
                    }
                }
            }

            if (tarefa != null) {
                tarefas.add(tarefa);
            }

            System.out.println("Lista de todas as tarefas importada do arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao importar lista de tarefas do arquivo: " + e.getMessage());
        }

        return tarefas;
    }
}
