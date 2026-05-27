import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senhaDigitada = 0;


        while (senhaCorreta != senhaDigitada) {
            System.out.println("Digite sua Senha:");
            senhaDigitada = sc.nextInt();


            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta! Tente novamente.\n");
            }
        }


        System.out.println("Acesso liberado!");

        sc.close();
    }
}