package iteracao_while;

public class Exercicio3 {

    public static void main(String[] args) {

        double[] notas = new double[] { 7.5, 8.0, 9.5, 10.0 };
        double soma = 0.0;
        int i = 0;

        System.out.println("===============================");

        while (i < notas.length) {
            System.out.println("As notas são: "+ notas[i]);
            soma = soma + notas[i];
            i = i + 1;
        }

        System.out.println("A média é " + soma / notas.length);

        System.out.println("===============================");
    }
}
