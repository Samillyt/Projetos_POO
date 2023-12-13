package matrizes;

public class Exercicio1 {

    public static void main(String[] args) {

        System.out.println("===============================");

        int[][] matriz = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1 }
        };

        int i, j;

        System.out.println("Conteúdo da matriz completa:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");

    }
}
