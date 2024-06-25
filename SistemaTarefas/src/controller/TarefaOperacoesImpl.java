package controller;

import java.util.List;
import java.util.Scanner;

import models.Tarefa;
import models.TarefaAlimentacao;
import models.TarefaConcreta;
import models.TarefaDataComemorativa;
import models.TarefaEstudo;
import models.TarefaExercicio;
import models.TarefaFinanceira;
import models.TarefaLazer;
import models.TarefaPessoal;
import models.TarefaProjetos;
import models.TarefaTrabalho;
import models.TarefaUrgente;
import view.TarefaView;

public class TarefaOperacoesImpl implements TarefaOperacoes {
    @Override
    public void adicionarTarefa(TarefaController tarefaController, Scanner scanner) {

            System.out.println("\n=== Adicionar Tarefa ===");
            System.out.print("Tipo de Tarefa (1-Estudo, 2-Trabalho, 3-Lazer, 4-Pessoal, 5-Urgente, 6-Exercicios, 7-Financeiro, 8-Alimentação, 9-Datas comemorativas, 10-Projeto): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();
            System.out.print("Data (YYYY-MM-DD): ");
            String dataTarefa = scanner.nextLine();
            System.out.print("Prioridade: ");
            String prioridade = scanner.nextLine();
            System.out.print("Status (Pendente/Concluída): ");
            String status = scanner.nextLine();
    
            Tarefa novaTarefa = null;
            switch (tipo) {
                case 1:
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();
                    novaTarefa = new TarefaEstudo(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, disciplina);
                    break;
                case 2:
                    System.out.print("Setor: ");
                    String setor = scanner.nextLine();
                    novaTarefa = new TarefaTrabalho(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, setor);
                    break;
                case 3:
                    System.out.print("Local: ");
                    String local = scanner.nextLine();
                    novaTarefa = new TarefaLazer(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa,
                            prioridade, status, local);
                    break;
                case 4:
                    System.out.print("Pessoa Envolvida: ");
                    String pessoaEnvolvida = scanner.nextLine();
                    novaTarefa = new TarefaPessoal(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, pessoaEnvolvida);
                    break;
                case 5:
                    System.out.print("Motivo da Urgência: ");
                    String motivoUrgencia = scanner.nextLine();
                    novaTarefa = new TarefaUrgente(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, motivoUrgencia);
                    break;

                    case 6:
                    System.out.print("Tipos de Exercicio: ");
                    String TipoExercicio = scanner.nextLine();
                    novaTarefa = new TarefaExercicio(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, TipoExercicio);
                    break;

                    case 7:
                    System.out.print("Boletos: ");
                    String OlharData = scanner.nextLine();
                    novaTarefa = new TarefaFinanceira(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, OlharData);
                    break;

                    case 8:
                    System.out.print("prato do dia: ");
                    String Prato = scanner.nextLine();
                    novaTarefa = new TarefaAlimentacao(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, Prato);
                    break;

                    case 9:
                    System.out.print("Datas comemorativas: ");
                    String Datas = scanner.nextLine();
                    novaTarefa = new TarefaDataComemorativa(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, Datas);
                    break;

                    case 10:
                    System.out.print("Qual: ");
                    String Qual = scanner.nextLine();
                    novaTarefa = new TarefaProjetos(tarefaController.listarTarefas().size() + 1, titulo, descricao,
                            dataTarefa, prioridade, status, Qual);
                    break;

                default:
                    System.out.println("Tipo de tarefa inválido.");
                    return;
            }
    
            tarefaController.adicionarTarefa(novaTarefa);
            System.out.println("Tarefa adicionada com sucesso!");
        }


    @Override
    public void editarTarefa(TarefaController tarefaController, Scanner scanner) {

            System.out.println("\n=== Editar Tarefa ===");
            System.out.print("ID da Tarefa a editar: ");
            int id = scanner.nextInt();
            scanner.nextLine();
    
            System.out.print("Novo Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Nova Descrição: ");
            String descricao = scanner.nextLine();
            System.out.print("Nova Data (YYYY-MM-DD): ");
            String dataTarefa = scanner.nextLine();
            System.out.print("Nova Prioridade: ");
            String prioridade = scanner.nextLine();
            System.out.print("Novo Status (Pendente/Concluída): ");
            String status = scanner.nextLine();
    
            Tarefa tarefaAtualizada = new TarefaConcreta(id, titulo, descricao, dataTarefa, prioridade, status);
            tarefaController.editarTarefa(id, tarefaAtualizada);
            System.out.println("Tarefa editada com sucesso!");
        
    }

    @Override
    public void excluirTarefa(TarefaController tarefaController, Scanner scanner) {
            System.out.println("\n=== Excluir Tarefa ===");
            System.out.print("ID da Tarefa a excluir: ");
            int id = scanner.nextInt();
            scanner.nextLine();
    
            tarefaController.excluirTarefa(id);
            System.out.println("Tarefa excluída com sucesso!");

    
    }

    @Override
    public void listarTarefas(TarefaController tarefaController, TarefaView tarefaView) {
            System.out.println("\n=== Lista de Tarefas ===");
            tarefaView.mostrarTarefas(tarefaController.listarTarefas());
    }


    @Override
    public void verEstatisticas(TarefaController tarefaController) {

            System.out.println("\n=== Estatísticas ===");
            int totalPendentes = 0;
            int totalConcluidas = 0;
    
            for (Tarefa tarefa : tarefaController.listarTarefas()) {
                if ("Pendente".equalsIgnoreCase(tarefa.getStatus())) {
                    totalPendentes++;
                } else if ("Concluída".equalsIgnoreCase(tarefa.getStatus())) {
                    totalConcluidas++;
                }
            }
    
            System.out.println("Total de Tarefas: " + tarefaController.listarTarefas().size());
            System.out.println("Total Pendentes: " + totalPendentes);
            System.out.println("Total Concluídas: " + totalConcluidas);

    }

    @Override
    public void marcarTarefaComoConcluida(TarefaController tarefaController, Scanner scanner) {
            System.out.println("\n=== Marcar Tarefa como Concluída ===");
            System.out.print("ID da Tarefa a marcar como Concluída: ");
            int id = scanner.nextInt();
            scanner.nextLine();
    
            for (Tarefa tarefa : tarefaController.listarTarefas()) {
                if (tarefa.getId() == id) {
                    tarefa.setStatus("Concluída");
                    System.out.println("Tarefa marcada como Concluída.");
                    return;
                }
            }
    
            System.out.println("Tarefa não encontrada.");

    }

    @Override
    public void exportarListaTarefasPorTipo(List<Tarefa> tarefas) {
        ExportadorTarefasPorTipo exportador = new ExportadorTarefasPorTipo();
        exportador.exportarListaTarefasPorTipo(tarefas, "lista_tarefas_por_tipo.txt");
        
    }

    @Override
    public void exportarTodasAsTarefas(List<Tarefa> tarefas) {
        ExportadorTodasAsTarefas exportador = new ExportadorTodasAsTarefas();
        exportador.exportarTodasAsTarefas(tarefas, "todas_as_tarefas.txt");
    }

    @Override
    public List<Tarefa> importarTodasAsTarefas(String nomeArquivo) {
        ImportadorTodasAsTarefas importador = new ImportadorTodasAsTarefas();
        return importador.importarTodasAsTarefas(nomeArquivo);
    }
}
