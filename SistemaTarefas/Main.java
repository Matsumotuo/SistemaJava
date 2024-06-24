import controller.*;
import models.*;
import view.*;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        TarefaView tarefaView = new TarefaView();
        TarefaOperacoes tarefaOperacoes = new TarefaOperacoesImpl();
        Scanner scanner = new Scanner(System.in);

        boolean ativo = true;

        while (ativo) {
            System.out.println("\n=== Gerenciamento de Tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Editar Tarefa");
            System.out.println("3. Excluir Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Ver Estatísticas");
            System.out.println("6. Marcar Tarefa como Concluída");
            System.out.println("7. Exportar tarefas por tipo");
            System.out.println("8. Exportar todas as tarefas");
            System.out.println("9. Importar todas as tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    tarefaOperacoes.adicionarTarefa(tarefaController, scanner);
                    break;
                case 2:
                    tarefaOperacoes.editarTarefa(tarefaController, scanner);
                    break;
                case 3:
                    tarefaOperacoes.excluirTarefa(tarefaController, scanner);
                    break;
                case 4:
                    tarefaOperacoes.listarTarefas(tarefaController, tarefaView);
                    break;
                case 5:
                    tarefaOperacoes.verEstatisticas(tarefaController);
                    break;
                case 6:
                    tarefaOperacoes.marcarTarefaComoConcluida(tarefaController, scanner);
                    break;
                case 7:
                    tarefaOperacoes.exportarListaTarefasPorTipo(tarefaController.listarTarefas());
                    break;
                case 8:
                    tarefaOperacoes.exportarTodasAsTarefas(tarefaController.listarTarefas());
                    break;
                case 9:
                    List<Tarefa> tarefasImportadas = tarefaOperacoes.importarTodasAsTarefas("todas_as_tarefas.txt");
                    // Adicionar as tarefas importadas ao controlador de tarefas
                    for (Tarefa tarefa : tarefasImportadas) {
                        tarefaController.adicionarTarefa(tarefa);
                    }
                    break;
                case 0:
                    ativo = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

}