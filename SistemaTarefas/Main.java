import controller.TarefaController;
import models.*;
import view.TarefaView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        TarefaView tarefaView = new TarefaView();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Gerenciamento de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Editar Tarefa");
            System.out.println("3. Excluir Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Ver Estatísticas");
            System.out.println("6. Marcar Tarefa como Concluída");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarTarefa(tarefaController, scanner);
                    break;
                case 2:
                    editarTarefa(tarefaController, scanner);
                    break;
                case 3:
                    excluirTarefa(tarefaController, scanner);
                    break;
                case 4:
                    listarTarefas(tarefaController, tarefaView);
                    break;
                case 5:
                    verEstatisticas(tarefaController);
                    break;
                case 6:
                    marcarTarefaComoConcluida(tarefaController, scanner);
                    break;
                case 7:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarTarefa(TarefaController tarefaController, Scanner scanner) {
        System.out.println("\n=== Adicionar Tarefa ===");
        System.out.print("Tipo de Tarefa (1-Estudo, 2-Trabalho, 3-Lazer, 4-Pessoal, 5-Urgente): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

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
                novaTarefa = new TarefaEstudo(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa, prioridade, status, disciplina);
                break;
            case 2:
                System.out.print("Setor: ");
                String setor = scanner.nextLine();
                novaTarefa = new TarefaTrabalho(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa, prioridade, status, setor);
                break;
            case 3:
                System.out.print("Local: ");
                String local = scanner.nextLine();
                novaTarefa = new TarefaLazer(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa, prioridade, status, local);
                break;
            case 4:
                System.out.print("Pessoa Envolvida: ");
                String pessoaEnvolvida = scanner.nextLine();
                novaTarefa = new TarefaPessoal(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa, prioridade, status, pessoaEnvolvida);
                break;
            case 5:
                System.out.print("Motivo da Urgência: ");
                String motivoUrgencia = scanner.nextLine();
                novaTarefa = new TarefaUrgente(tarefaController.listarTarefas().size() + 1, titulo, descricao, dataTarefa, prioridade, status, motivoUrgencia);
                break;
            default:
                System.out.println("Tipo de tarefa inválido.");
                return;
        }

        tarefaController.adicionarTarefa(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void editarTarefa(TarefaController tarefaController, Scanner scanner) {
        System.out.println("\n=== Editar Tarefa ===");
        System.out.print("ID da Tarefa a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

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

        Tarefa tarefaAtualizada = new Tarefa(id, titulo, descricao, dataTarefa, prioridade, status);
        tarefaController.editarTarefa(id, tarefaAtualizada);
        System.out.println("Tarefa editada com sucesso!");
    }

    private static void excluirTarefa(TarefaController tarefaController, Scanner scanner) {
        System.out.println("\n=== Excluir Tarefa ===");
        System.out.print("ID da Tarefa a excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        tarefaController.excluirTarefa(id);
        System.out.println("Tarefa excluída com sucesso!");
    }

    private static void listarTarefas(TarefaController tarefaController, TarefaView tarefaView) {
        System.out.println("\n=== Lista de Tarefas ===");
        tarefaView.mostrarTarefas(tarefaController.listarTarefas());
    }

    private static void verEstatisticas(TarefaController tarefaController) {
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

    private static void marcarTarefaComoConcluida(TarefaController tarefaController, Scanner scanner) {
        System.out.println("\n=== Marcar Tarefa como Concluída ===");
        System.out.print("ID da Tarefa a marcar como Concluída: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consumir nova linha

        for (Tarefa tarefa : tarefaController.listarTarefas()) {
            if (tarefa.getId() == id) {
                tarefa.setStatus("Concluída");
                System.out.println("Tarefa marcada como Concluída.");
                return;
            }
        }

        System.out.println("Tarefa não encontrada.");
    }
}