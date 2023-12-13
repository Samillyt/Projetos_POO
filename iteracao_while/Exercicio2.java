package iteracao_while;

public class Exercicio2 {

    public static void main(String[] args) {

        double[] valoresInverso = new double[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int i = valoresInverso.length - 1;

        System.out.println("===============================");

        while (i >= 0) {
            System.out.println(valoresInverso[i]);

            i = i - 1;
        }
        System.out.println("===============================");
    }
}