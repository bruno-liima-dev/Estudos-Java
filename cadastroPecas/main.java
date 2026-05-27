import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] pecas = new String[5];


        for (int i = 0; i < 5; i++) {

            System.out.println("Digite pecas:");

            pecas[i] = sc.nextLine();


        }

        System.out.println("\nPeças cadastradas:");

        for (int i = 0; i < 5; i++) {
            System.out.println(pecas[i]);
        }

        sc.close();
    }
}