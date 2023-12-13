package iteracao_for;

public class Exercicio2 {

    public static void main(String[] args) {

        System.out.println("===============================");

        double[] valoresInverso = new double[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

        for (int i = valoresInverso.length - 1; i >= 0; i--) {
            System.out.println(valoresInverso[i]);
        }

        System.out.println("===============================");

    }
}
