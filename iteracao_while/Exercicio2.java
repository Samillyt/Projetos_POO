package iteracao_while;

public class Exercicio2 {

    public static void main(String[] args) {

        double[] valoresInverso = new double[] { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int i = valoresInverso.length - 1;

        System.out.println("===============================");

        // Enquanto a iteração for maior ou igual a zero vai repetir
        while (i >= 0) {
            System.out.println(valoresInverso[i]);

            // Subtraindo 1 ao índice atual
            i = i - 1;
        }
        System.out.println("===============================");
    }
}