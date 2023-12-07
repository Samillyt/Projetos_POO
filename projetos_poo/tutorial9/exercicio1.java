package tutorial9;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        System.out.println("===============================");

        if (numero1 >= numero2) {
            System.out.println(numero1);
        }

        else {
            System.out.println(numero2);
        }
        System.out.println("===============================");
        sc.close();

    }
}