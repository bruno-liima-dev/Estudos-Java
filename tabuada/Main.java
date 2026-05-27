import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        while (numero < 1 || numero > 10) {
            System.out.println("Escolha um numero entre 1 e 10");
            numero = sc.nextInt();
        }


        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();

    }
}
