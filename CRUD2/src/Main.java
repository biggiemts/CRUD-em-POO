
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Gerecia gerenciador = new Gerecia();

        boolean mainLoop = true;
        int cases;

        while (mainLoop) {
            try{
                System.out.println(" -- Sua lista de tarefas --\n");
                System.out.println("Oque Deseja realizar?\n\n 1 - Adicionar Tarefa\n 2 - Mostrar todas as tarefas\n 3 - editar alguma tarefa\n 4 - marcar como concluida\n 5 - deletar alguma tarefa\n 6 - sair do porgrama\n");
                cases = input.nextInt();
                input.nextLine();
            } catch (Exception e){
                System.out.println("\n Digite apenas numeros !!!\n");
                input.nextLine();
                continue;
            }

            switch (cases){
                case 1: // adicionar
                    System.out.println("\nEscreva sua nova tarefa:\n");
                    String add = input.nextLine();
                    gerenciador.adiciona(add);
                    System.out.println("\nTarefa adicionada com sucesso!\n");
                break;
                case 2: // mostrar
                    if(!gerenciador.temTarefa()){
                        System.out.println("\nNão ha nenhuma tarefa!!!\n");
                    } else {
                        System.out.println("\n - Suas Tarefas - \n");
                        gerenciador.mostraTarefa();
                        System.out.println();
                    }
                break;
                case 3: // editar
                    if(!gerenciador.temTarefa()){
                        System.out.println("\nNao existe nenhuma tarefa, \npois então noa tem como editar!!!\n");
                    }else {
                        System.out.println("Atualizando tarefa");
                        System.out.println("\nQual tarefa deseja atualizar?");
                        int tarefaVelha = input.nextInt();
                        input.nextLine();

                        System.out.println("escreva a nova tarefa agora:\n");
                        String novoTarefa = input.nextLine();

                        gerenciador.edita(tarefaVelha, novoTarefa);
                        System.out.println("\nTarefa atualizada com sucesso!\n");
                    }

                break;
                case 4:// marcar como concluida
                    int con;
                    try{
                        System.out.println("Qual tarrefa deseja marcar como concluida?\n");
                        con = input.nextInt();
                        input.nextLine();
                    } catch (Exception e){
                        System.out.println("Digite apenas numeros !!!\n");
                        input.nextLine();
                        continue;
                    }


                    gerenciador.concluirTarefa(con);
                break;
                case 5: // deletar
                    boolean deleteLoop = true;
                    int tDeletar;
                    int vereficaN;

                    while (deleteLoop){
                        if(!gerenciador.temTarefa()){
                            System.out.println("\n Nao há nenhuma tarefa que possa ser deletada\n");
                            deleteLoop = false;
                        }else {
                            try {
                                System.out.println("Tem certeza que deseja deletar uma Tarefa?\n sim = 1 | nao = 2\n");
                                vereficaN = input.nextInt();
                                input.nextLine();
                            } catch (Exception e) {
                                System.out.println("digite apenas numeros!!!");
                                input.nextLine();
                                continue;
                            }
                            if (vereficaN == 2) {
                                System.out.println("Voltando ao menu");
                                deleteLoop = false;
                            } else if (vereficaN == 1) {
                                System.out.println("qual tarefa deseja deletar?\n");
                                tDeletar = input.nextInt();
                                input.nextLine();

                                gerenciador.delete(tDeletar);
                                deleteLoop = false;
                            } else {
                                System.out.println("Operação invalida!!! Digite apenas 1 ou 2");
                            }
                        }
                    }
                break;
                case 6: //sair
                    int sair;
                    try{
                        System.out.println("\ntem certeza que deseja sair ?\n 1 - Sim | 2 - Não");
                        sair = input.nextInt();
                        input.nextLine();
                    }catch (Exception e){
                        System.out.println("digite apenas numeros!!!");
                        input.nextLine();
                        continue;
                    }
                    mainLoop = gerenciador.fecharPrograma(sair);
                break;
                default:
                    System.out.println("Operação invalida!!!");
                break;
            }
        }
        input.close();
    }
}