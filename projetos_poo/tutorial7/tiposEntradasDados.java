package tutorial7;

import java.util.Scanner;

public class tiposEntradasDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        
        System.out.println("===============================");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é de " + idade + " anos");
        System.out.println("Sua altura é de " + altura + " cm");
        System.out.println("===============================");

        sc.close();

    }

}
