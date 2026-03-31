import java.util.ArrayList;


public class Gerecia {


    int i = 0;
    ArrayList<Tarefa> tarefa = new ArrayList<>();

    public boolean temTarefa(){
        return !tarefa.isEmpty();
    }

    public void adiciona(String nome) {
        Tarefa lista = new Tarefa(nome);
        tarefa.add(lista);
    }

    public void mostraTarefa(){
        for( i = 0; i < tarefa.size(); i++){
            Tarefa t = tarefa.get(i);
            String status = t.isConcluido() ? "Tarefa concluida ✅" : "Tarefa nao concluida ❌";
            System.out.println((i + 1) + " - " + t.getNome() + " - " + status);
        }
    }

    public void concluirTarefa(int num){
        int indice = num -1;
        if (indice >= 0 && indice < tarefa.size()){
            Tarefa i = tarefa.get(indice);
            i.setConcluido(true);
            System.out.println("✅ Tarefa " + i.getNome() + " concluida com sucesso!\n" );
        } else {
            System.out.println("Tarefa inexistente!");
        }
    }

    public void edita(int tarefaAntiga, String novoTarefa ){
            Tarefa tarefaAtualizada = new Tarefa(novoTarefa);
            tarefa.set( tarefaAntiga- 1, tarefaAtualizada);
    }

    public void delete(int tDeletar){
        if (tDeletar > 0 && tDeletar <= tarefa.size()) {
            tarefa.remove(tDeletar - 1);
            System.out.println("Tarefa removida com sucesso!\n");
        } else {
            System.out.println("Esta tarefa nao existente!!!\n");
        }
    }

    public boolean fecharPrograma(int num){

        if (num == 1){
            System.out.println("fechando programa\n");
             return false;
        }else if (num == 2){
            System.out.println("voltando para o menu!\n");
            return true;
        }else{
            System.out.println("Operação invalida! Digite apenas 1 ou 2\n");
            return true;
        }
    }
}
