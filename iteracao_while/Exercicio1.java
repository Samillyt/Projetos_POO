package iteracao_while;

public class Exercicio1 {

    public static void main(String[] args) {

        int[] valores = new int[] { 5, 10, 15, 20, 25 };
        int i = 0;

        System.out.println("===============================");

        while (i < valores.length) {
            System.out.println(valores[i]);

            i = i + 1;
        }

        System.out.println("===============================");
    }

}
