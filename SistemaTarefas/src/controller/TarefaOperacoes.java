package controller;

import models.*;
import view.*;

import java.util.List;
import java.util.Scanner;

public interface TarefaOperacoes {
    void adicionarTarefa(TarefaController tarefaController, Scanner scanner);

    void editarTarefa(TarefaController tarefaController, Scanner scanner);

    void excluirTarefa(TarefaController tarefaController, Scanner scanner);

    void listarTarefas(TarefaController tarefaController, TarefaView tarefaView);

    void verEstatisticas(TarefaController tarefaController);

    void marcarTarefaComoConcluida(TarefaController tarefaController, Scanner scanner);

    void exportarListaTarefasPorTipo(List<TodasAsTarefas> tarefas);

    void exportarTodasAsTarefas(List<TodasAsTarefas> tarefas);

    List<TodasAsTarefas> importarTodasAsTarefas(String nomeArquivo);
}