package if_else;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");

        double valorMaca = 0.30;
        double descontoMaca = 0.25;

        System.out.println("Quantas maças deseja comprar?");
        int compradas = sc.nextInt();

        // Imprime o valor da compra de maças
        if (compradas >= 12) {
            System.out.println("O valor é " + compradas * descontoMaca+" reais");
        }

        else {
            System.out.println("O valor é " + compradas * valorMaca+" reais");
        }

        System.out.println("===============================");

        sc.close();
    }
}
