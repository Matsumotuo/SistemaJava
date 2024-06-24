package models;
import view.ExecutarTarefas;

public class TarefaExercicio extends Tarefa implements ExecutarTarefas {
    private String TipoExercicio;

    

    @Override
    public String toString() {
        return super.toString() + ", TipoExercicio='" + TipoExercicio + '\'' + '}';
    }



    public TarefaExercicio(int id, String titulo, String descricao, String dataTarefa, String prioridade, String status,
            String tipoExercicio) {
        super(id, titulo, descricao, dataTarefa, prioridade, status);
        TipoExercicio = tipoExercicio;
    }



    @Override
    public void executar() {
        System.out.println("Executando tarefa de exercício: " + getTitulo());
    }



    public String getTipoExercicio() {
        return TipoExercicio;
    }



    public void setTipoExercicio(String tipoExercicio) {
        TipoExercicio = tipoExercicio;
    }
}
