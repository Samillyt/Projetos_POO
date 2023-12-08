package if_else;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");

        System.out.println("Digite seu ano de nascimento:");
        int dataDeNascimento = sc.nextInt();

        // Imprime se a idade permite voter
        if (dataDeNascimento <= 2007) {
            System.out.println("Você pode Votar!");
        }

        else {
            System.out.println("Você ainda não pode Votar!");
        }

        System.out.println("===============================");

        sc.close();
    }
}
