import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n===== OFICINA =====");
            System.out.println("1 - Trocar Oleo");
            System.out.println("2 - Trocar pneu");
            System.out.println("3 - Alinhamento");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opcao:");


            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("1 - Voce escolheu  Trocar Oleo");
                    break;

                case 2:
                    System.out.println("2 - Voce escolheu Trocar pneu");

                    break;

                case 3:
                    System.out.println("3 - Voce escolheu Alinhamento");

                    break;

                case 4:
                    System.out.println("4 - Encerrando sistema");

                    break;

                default:
                    System.out.println("Opcao invalida!");

            }

        }
        sc.close();
    }

}