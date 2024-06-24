1. Breve Descrição do Projeto
O projeto Sistema de Gerenciamento de Tarefas é uma aplicação Java destinada a facilitar a organização e gestão de tarefas. O sistema permite adicionar, editar, excluir, listar, marcar como concluída e exportar/importar tarefas, proporcionando uma maneira eficiente de gerenciar atividades diárias.

2. Objetivos e Funcionalidades Principais
Objetivos:

Facilitar a organização de tarefas diárias.
Prover uma interface de fácil uso para a manipulação das tarefas.
Permitir a exportação e importação de tarefas para e a partir de arquivos, garantindo a persistência e a portabilidade das informações.
Funcionalidades Principais:

Adicionar Tarefa: Permite ao usuário adicionar uma nova tarefa ao sistema.
Editar Tarefa: Permite ao usuário editar uma tarefa existente.
Excluir Tarefa: Permite ao usuário excluir uma tarefa do sistema.
Listar Tarefas: Exibe uma lista de todas as tarefas cadastradas.
Ver Estatísticas: Mostra estatísticas sobre as tarefas, como o número de tarefas concluídas e pendentes.
Marcar Tarefa como Concluída: Permite ao usuário marcar uma tarefa como concluída.
Exportar Tarefas por Tipo: Exporta uma lista de tarefas filtradas por tipo para um arquivo.
Exportar Todas as Tarefas: Exporta todas as tarefas para um arquivo.
Importar Todas as Tarefas: Importa todas as tarefas de um arquivo previamente exportado.

3. Informações sobre as Classes e suas Relações
Pacote controller:

Classe TarefaController:

Gerencia a lógica principal das operações de tarefas.
Métodos: adicionarTarefa, editarTarefa, excluirTarefa, listarTarefas.
Classe ExportadorTodasAsTarefas:

Exporta todas as tarefas para um arquivo de texto.
Método: exportarTodasAsTarefas.
Classe ExportadorTarefasPorTipo:

Exporta tarefas filtradas por tipo para um arquivo de texto.
Método: exportarListaTarefasPorTipo.
Classe ImportadorTodasAsTarefas:

Importa todas as tarefas de um arquivo de texto.
Método: importarTodasAsTarefas.
Interface TarefaOperacoes:

Define as operações que podem ser realizadas nas tarefas.
Métodos: adicionarTarefa, editarTarefa, excluirTarefa, listarTarefas, verEstatisticas, marcarTarefaComoConcluida, exportarListaTarefasPorTipo, exportarTodasAsTarefas, importarTodasAsTarefas.
Classe TarefaOperacoesImpl:

Implementa a interface TarefaOperacoes.
Métodos: Implementação de todos os métodos definidos na interface TarefaOperacoes.
Pacote models:

Classe Tarefa:
Representa uma tarefa.
Atributos: id, titulo, descricao, dataTarefa, prioridade, status.
Métodos: Getters e setters para os atributos.
Pacote view:

Classe TarefaView:
Responsável pela exibição das tarefas.
Métodos: Implementação de métodos para exibir tarefas e mensagens ao usuário.
Classe Main:

Contém o método main que inicializa e executa a aplicação.
Controla o fluxo principal do programa e interage com o usuário através do console.

4. Uso do ChatGPT
O ChatGPT foi utilizado para auxiliar na refatoração e melhoria do código, além de criar a documentação. As principais contribuições incluem:

Refatoração da Main.java para torná-la mais limpa e organizada.
Criação de interfaces para definir operações e implementação das mesmas.
Adição de novas funcionalidades, como a importação de tarefas a partir de arquivos.
Criação de documentação abrangente que descreve o projeto, seus objetivos, funcionalidades, classes e relações.
Funcionalidade de Marcar como Concluída: Implementar a funcionalidade de marcar uma tarefa como concluída no menu principal, facilitando a interação do usuário com a aplicação.
Corrigir erros dos métodos de exportação. 