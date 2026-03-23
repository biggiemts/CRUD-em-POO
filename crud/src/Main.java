import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int i = 0;
        int opcao = 0;
        boolean continuar = true;


        while (continuar) {
            try {
                System.out.println("\n-----BLOCO DE TAREFAS-----");
                System.out.println("\nAdicionar tarefa -1\nLer tarefas -2\nEditar tarefa -3\nExcluir tarefas -4\nSair do bloco -5\n");
                opcao = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println(" Digite APENAS numeross!!!");
                input.nextLine();
                continue;
            }

            switch (opcao) {
                case 1: // add
                    System.out.println("Adicionar Tarefa");
                    String nome = input.nextLine();
                    Tarefa tarefa = new Tarefa(nome);
                    nomes.add(nome);
                    System.out.println("Tarefa adicionada com sucesso!");
                break;
                case 2: // mostrar
                    System.out.println("- MINHA LISTA DE TAREFAS -\n");
                    if(nomes.isEmpty()){
                        System.out.println("Nenhuma tarefa foi adicionada!");
                    } else {
                        for (i = 0; i < nomes.size(); i++){
                            System.out.println("📌 " + (i + 1) + " - " + nomes.get(i));
                        }
                    }
                    break;
                case 3: // edit
                    System.out.println("Atualizar Tarefa\n");
                    System.out.println("Qual tarefa deseja editar?\n");
                    int indice = input.nextInt();
                    input.nextLine();

                    System.out.println("Escreva a nova tarefa: \n");
                    String escreve = input.nextLine();

                    nomes.set(indice - 1, escreve);

                break;
                case 4: //delete
                    boolean dele = true;
                    int Ex = 0;
                    while (dele) {
                        try {
                            System.out.println("Tem certeza que deseja excluir uma tarefa?\n Sim = 1 | nao = 2 (voltar ao menu)");
                             Ex = input.nextInt();
                            input.nextLine();
                        } catch (Exception e){
                            System.out.println("Digite APENAS numeros!!!\n");
                            continue;
                        }

                        if(Ex == 2){
                            dele = false;
                        } else {
                            System.out.println("Qual tarefa deseja excluir?\n");
                            int t = input.nextInt();
                            input.nextLine();

                            if (t > 0 && t <= nomes.size()) {
                                nomes.remove(t - 1);
                                System.out.println("Tarefa removida com sucesso!\n");
                                dele = false;
                            } else {
                                System.out.println("Esta tarefa nao existe ou nao há nenhuma tarefa!!!\n");
                            }
                        }
                    }
                break;
                case 5: // fechar programa
                    int sair = 0;
                    boolean sair1 = true;

                    while (sair1) {
                        try {
                            System.out.println("\n Tem certeza que quer sair ?");
                            System.out.print("sim = 1 | nao = 2\n");
                            sair = input.nextInt();
                            input.nextLine();
                             if  (sair == 1 || sair == 2) {
                                 sair1 = false;
                             }else{
                                 System.out.println("Digite apenas 1 ou 2!!!\n");
                             }
                        } catch (Exception e) {
                            System.out.println("Digite APENAS numeros!!!\n");
                            input.nextLine();
                            continue;

                        }
                    }

                    if (sair == 1) {
                        System.out.println("saindo!!");
                        continuar = false;
                    } else if (sair == 2) {
                        System.out.println("opa!! Continuando");
                    } else {
                        System.out.println("Operação invalida!!!");
                    }

                break;
                default:
                    System.out.println("Digite uma oepração valida!!!");
                break;
            }

        }
        input.close();
    }
}