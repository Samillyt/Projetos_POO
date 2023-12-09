package iteracao_while;

public class Exercicio1 {

    public static void main(String[] args) {

        int[] valores = new int[] { 5, 10, 15, 20, 25 };
        int i = 0;

        System.out.println("===============================");

        // Enquanto o índice(i) for menor que o comprimento vai repetir
        while (i < valores.length) {
            System.out.println(valores[i]);

            // Somando 1 ao índice atual
            i = i + 1;
        }

        System.out.println("===============================");
    }

}
