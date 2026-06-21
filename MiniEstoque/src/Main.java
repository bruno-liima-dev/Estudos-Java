import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean encontrada = false;
        String[] pecas = new String[5];
        int proximaPosicao = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== ESTOQUE =====");
            System.out.println("1 - Cadastrar peca");
            System.out.println("2 - Listar peças");
            System.out.println("3 - Buscar peca");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opcao");

            opcao = sc.nextInt();

            sc.nextLine();


            switch (opcao) {

                case 1:

                    System.out.println("Digite uma peca:");

                    pecas[proximaPosicao] = sc.nextLine();
                    proximaPosicao++;

                    System.out.println("Cadastro realizado.");

                    break;

                case 2:

                    System.out.println("\nPecas Cadastradas:");

                    for (int i = 0; i < proximaPosicao; i++) {

                        System.out.println(pecas[i]);


                    }
                    break;

                case 3:
                    encontrada = false;


                    System.out.println("Digite a peca que deseja buscar:");

                    String busca = sc.nextLine();


                    for (int i = 0; i < proximaPosicao; i++) {

                        if (pecas[i].equals(busca)) {

                            System.out.println(pecas[i]);
                            encontrada = true;

                            System.out.println("Peca localizada!");

                            break;


                        }


                    }

                    if (!encontrada) {

                        System.out.println("peca nao encontrada!");

                    }

                    break;


                case 4:
                    System.out.println("Encerrando programa!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;


            }

        }
        sc.close();
    }

}