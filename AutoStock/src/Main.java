import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean encontrada = false;
        String[] pecas = new String[5];


        for (int i = 0; i < 5; i++) {

            System.out.println("Digite uma peca");
            pecas[i] = sc.nextLine();

        }
        System.out.println("Pecas cadastradas");

        System.out.println("Digite a peça que deseja procurar no estoque: ");

        String busca = sc.nextLine();

        for (int i = 0; i < 5; i++) {

            if (pecas[i].equals(busca)) {
                encontrada = true;
            }
        }

        if (encontrada) {
            System.out.println("Peca encontrada!");
        } else {
            System.out.println("Peca nao encontrada!");
        }

        sc.close();
    }


}







