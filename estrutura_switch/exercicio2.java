package estrutura_switch;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Digite um número referente ao mês desejado:");
        int mes = sc.nextInt();
        System.out.println("===============================");

        switch (mes) {
            case 1:
                System.out.println("Número referente ao mês de Janeiro");
                
                break;
            case 2:
                System.out.println("Número referente ao mês de Fevereiro");
                break;
            case 3:
                System.out.println("Número referente ao mês de Março");
                break;
            case 4:
                System.out.println("Número referente ao mês de Abril");
                break;
            case 5:
                System.out.println("Número referente ao mês de Maio");
                break;
            case 6:
                System.out.println("Número referente ao mês de Junho");
                break;
            case 7:
                System.out.println("Número referente ao mês de Julho");
                break;
            case 8:
                System.out.println("Número referente ao mês de Agosto");
                break;
            case 9:
                System.out.println("Número referente ao mês de Setembro");
                break;
            case 10:
                System.out.println("Número referente ao mês de Outubro");
                break;
            case 11:
                System.out.println("Número referente ao mês de Novembro");
                break;
            case 12:
                System.out.println("Número referente ao mês de Dezembo");
                break;

            default:
                System.out.println("Mês não encontrado");
                break;

        }
        System.out.println("===============================");

        sc.close();

    }
}