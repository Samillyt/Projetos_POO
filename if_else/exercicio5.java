package if_else;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Digite três números:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        System.out.println("===============================");

      
        // Imprime os números em ordem crescente
        if (numero1 <= numero2 && numero1 <= numero3) {
            System.out.print(numero1 + ", ");

            if (numero2 <= numero3) {
                System.out.print(numero2 + ", ");
                System.out.println(numero3);
            } else {
                System.out.print(numero3 + ", ");
                System.out.println(numero2);
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.print(numero2 + ", ");

            if (numero1 <= numero3) {
                System.out.print(numero1 + ", ");
                System.out.println(numero3);
            } else {
                System.out.print(numero3 + ", ");
                System.out.println(numero1);
            }
        } else {
            System.out.print(numero3 + ", ");

            if (numero1 <= numero2) {
                System.out.print(numero1 + ", ");
                System.out.println(numero2);
            } else {
                System.out.print(numero2 + ", ");
                System.out.println(numero1);
            }
        }

        System.out.println("===============================");

        sc.close();
    }
}