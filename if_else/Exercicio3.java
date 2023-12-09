package if_else;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");

        // Imprime se a senha está correta
        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO!");
        }

        else {
            System.out.println("ACESSO NEGADO!");
        }

        System.out.println("===============================");

        sc.close();
    }
}