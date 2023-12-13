package if_else;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");

        System.out.println("Digite um numéro:");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro numéro:");
        int numero2 = sc.nextInt();

        System.out.println("===============================");

        // Imprime o maior números
        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior");
        }

        else {
            System.out.println("O número " + numero2 + " é maior");
        }

        System.out.println("===============================");

        sc.close();

    }
}