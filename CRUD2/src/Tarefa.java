public class Tarefa {
    private String nome;
    private boolean concluido;

    public Tarefa(String nome){
        this.nome = nome;
        this.concluido = false;
    }

    public String getNome(){
        return this.nome;

    }
    public boolean isConcluido(){
        return this.concluido;
    }
    public void setConcluido(boolean status){
        this.concluido = status;
    }


}
