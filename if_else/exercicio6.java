package if_else;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Digite 1-se for mulher ou 2-se for homem:");
        int genero = sc.nextInt();

        System.out.println("===============================");

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        System.out.println("===============================");

        // Imprime o peso ideal
        if (genero == 1) {
            System.out.println("O peso ideal é " + (62.1 * altura - 44.7));
        }

        else {
            System.out.println("O peso ideal é " + (72.7 * altura - 58));
        }

        sc.close();

    }
}
