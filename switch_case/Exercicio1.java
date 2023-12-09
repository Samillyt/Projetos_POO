package switch_case;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Digite uma letra:");
        char letra = sc.next().charAt(0);
        System.out.println("===============================");

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Está letra é uma Vogal");
                System.out.println("===============================");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("Está letra é uma Consoante");
                System.out.println("===============================");
                break;

            default:
                System.out.println("Informar letra minúscula");
                System.out.println("===============================");
                break;

        }

        sc.close();
    }

}
